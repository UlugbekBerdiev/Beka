package API;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class PetStoreTest {
    /*
     * Scenario: Find a pet by status available
     * Given valid endpoint exist
     * When I send a GET request by status "available" to valid endpoint
     * Then Response status code should be 200
     * And Content type should be "application/json"
     */

    String url;

    @Test
    public void get() {
        url = "https://petstore.swagger.io/v2/pet/findByStatus";
        given().queryParam("status", "available")
                .accept(ContentType.JSON)
                .when().get(url)
                .then().statusCode(200).contentType("application/json");

        Response myResponse = given().queryParam("status", "available")
                .accept(ContentType.JSON)
                .when().get(url);
        myResponse.prettyPrint();

    }

    @Test
    public void post() {
        url = "https://petstore.swagger.io/v2/pet";

        String body = "{\n" +
                "    \"id\": 235223,\n" +
                "    \"category\": {\n" +
                "        \"id\": 0,\n" +
                "        \"name\": \"Beka\"\n" +
                "    },\n" +
                "    \"name\": \"doggie\",\n" +
                "    \"photoUrls\": [\n" +
                "        \"string\"\n" +
                "    ],\n" +
                "    \"tags\": [\n" +
                "        {\n" +
                "            \"id\": 0,\n" +
                "            \"name\": \"string\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"status\": \"available\"\n" +
                "}";
       Response resp = given().contentType("application/json").accept(ContentType.JSON)
                .body(body).post(url);
       Assert.assertEquals(resp.getStatusCode(), 200);
       String responseBody = resp.body().asPrettyString();
       Assert.assertEquals(responseBody, body);

    }

    @Test
    public void invalid() {
        url = "https://petstore.swagger.io/v2/pet/INVALID";

        Response myResponse = given().queryParam("status", "available")
                .accept(ContentType.JSON)
                .when().get(url);
        Assert.assertEquals(myResponse.getStatusCode(), 404);
        Assert.assertEquals(myResponse.contentType(), "application/json");
    }

    @Test
    public void test2() {
        url = "https://petstore.swagger.io/v2/pet/22222";
        Response myResponse = given().accept(ContentType.JSON)
                .when().get(url);
        Assert.assertEquals(myResponse.getStatusCode(), 200);
        Assert.assertEquals(myResponse.contentType(), "application/json");

        int id = myResponse.path("id");
        String name = myResponse.path("name");

        Assert.assertEquals(id, 22222);
        Assert.assertEquals(name, "fish");
    }

    /*
     * Scenario: As a user, I should be able to perform GET request to find a pet by id
     * Given I have the GET request URL
     * When I perform GET request to URL with pet id 227007
     * Then Response status code should be 200
     * And content type should be "application/json"
     * And pet id is 227007, pet name is "booboo"  status is "available"
     * And validate category id is 5, category name is dog
     * And validate tags id is 1234, and tags name is booboodc
     */
    @Test
    public void booboo() {
        url = "https://petstore.swagger.io/v2/pet/222222";
        Response myResponse = given().accept(ContentType.JSON)
                .when().get(url);
        int id = myResponse.path("id");
        String name = myResponse.path("name");
        String tagName = myResponse.path("tags[0].name");
        int tagIid = myResponse.path("tags[0].id");
        System.out.println("tagID" + tagIid);
        Assert.assertEquals(myResponse.getStatusCode(), 200);
        Assert.assertEquals(myResponse.contentType(), "application/json");
        Assert.assertEquals(id, 222222);
        Assert.assertEquals(name, "fish");
        Assert.assertEquals(tagName, "donal");


    }

    @Test
    public void map() {
        url = "https://petstore.swagger.io/v2/pet/222222";
        Response myResponse = given().accept(ContentType.JSON)
                .when().get(url);
        List list = myResponse.jsonPath().getList("tags");
        System.out.println(list);


    }

    @Test
    public void wrongID() {
        url = "https://petstore.swagger.io/v2/pet/00000";
        Response myResponse = given().accept(ContentType.JSON)
                .when().get(url);

       String massage =  myResponse.path("message");
        System.out.println( myResponse.getStatusCode());
        System.out.println(massage);

        Assert.assertEquals(myResponse.getStatusCode(), 404);
        Assert.assertEquals(massage, "Pet not found");
    }
    @Test
    public void get2() {
        url = "https://petstore.swagger.io/v2/pet/findByStatus";
//        given().queryParam("status", "available")
//                .accept(ContentType.XML)
//                .when().get(url)
//                .then().statusCode(200).contentType("application/json");

        Response myResponse = given().queryParam("status", "available")
                .accept(ContentType.JSON)
                .when().get(url);

        myResponse.prettyPrint();

    }

}