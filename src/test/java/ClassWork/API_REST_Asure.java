package ClassWork;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.Assert.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import org.testng.annotations.BeforeTest;

public class API_REST_Asure {
    @BeforeTest
    public static void setup() {
        //RestAssured.baseURI = "https://reqres.in/api";
    }

    @Test
    public void getRequest() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://randomuser.me/api/").prettyPrint();

       // Assert.assertEquals(200, response.statusCode());
       // Assert.assertEquals("qui est esse", response.jsonPath().getString("title[1]"));
    }
}