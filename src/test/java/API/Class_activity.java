package API;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.keyStore;
import static org.hamcrest.Matchers.*;

public class Class_activity {
    String url;
    @Test
    public void adWithJSON() throws IOException {
        url = "https://petstore.swagger.io/v2/pet";

        File body = new File("src/test/java/API/Json/BODY/adNewPet.json");

        String content= new String(Files.readAllBytes(Paths.get("src/test/java/API/Json/BODY/adNewPet.json")));
        Response resp = given().contentType("application/json").accept(ContentType.JSON)
                .body(body).post(url);

        Assert.assertEquals(resp.getStatusCode(), 200);
//        String responseBody = resp.body().asPrettyString();
//        Assert.assertEquals(responseBody, content);
//        resp.prettyPrint();
    }
    @Test
    public void validateChain() throws IOException {
        url = "https://petstore.swagger.io/v2/pet";

        File body = new File("src/test/java/API/Json/BODY/adNewPet.json");
        String content = new String(Files.readAllBytes(Paths.get("src/test/java/API/Json/BODY/adNewPet.json")));

                 given().contentType("application/json").accept(ContentType.JSON)
                .and().body(body).post(url)
                .then().assertThat().statusCode(200)
                .and().assertThat().contentType("application/json")
                .and().assertThat().body("id", equalTo(334455))
                .and().assertThat().body("category.id", equalTo(0))
                .and().assertThat().body("category.name", equalTo("doggie"))
                .and().assertThat().body("name", equalTo("booboo"));
    }

    @Test
    public void invalidPost() throws IOException {
        url = "https://petstore.swagger.io/v2/pet";

        File body = new File("src/test/java/API/Json/BODY/invalid.json");
               given().contentType("application/json").accept(ContentType.JSON)
                .and().body(body).post(url)
                .then().assertThat().statusCode(200)
                .and().assertThat().contentType("application/json")
                .and().assertThat().body("id", equalTo(334455))
                .and().assertThat().body("category.id", equalTo(0))
                .and().assertThat().body("category.name", equalTo("doggie"))
                .and().assertThat().body("name", equalTo("booboo"));
    }
    @Test
    public void test() throws IOException {
        url = "https://petstore.swagger.io/v2/pet";

        File body = new File("src/test/java/API/Json/BODY/adNewPet.json");

       Response resp = given().contentType("application/json").accept(ContentType.JSON)
                .and().body(body).put(url);

       resp.then().assertThat().statusCode(200)
               .and().assertThat().body("photoUrls[0]", equalTo("string"));
        System.out.println(resp.path("photoUrls[0]").toString());
}
    @Test
    public void delete() {
        url = "https://petstore.swagger.io/v2/pet/";

        File body = new File("src/test/java/API/Json/BODY/adNewPet.json");

              Response resp =   given().contentType("application/json").accept(ContentType.JSON).header("api_key", "key")

                .and().delete(url+334455);
        resp.prettyPrint();
    }
}