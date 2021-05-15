package API;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class API_practice {

    @Test
    public void api(){
        //Response responce = RestAssured.given().get("https://reqres.in/api/user");
        //responce.prettyPrint();
//        Response responce2 = RestAssured.given().get("https://reqres.in/api/users?page=2");
//        responce2.prettyPrint();
//        Response responce3 = RestAssured.given().get("https://reqres.in/api/user");
//        responce3.prettyPrint();
//        //List<String> listJson = responce3.jsonPath().getList("$");

        Response responce = doGetRequest("https://reqres.in/api/user");
        //List<String> listJson = responce.jsonPath().getList("$");
       // System.out.println(listJson);
        responce.prettyPrint();

    }
    public static Response doGetRequest(String endpoint) {
        RestAssured.defaultParser = Parser.JSON;

        return
                RestAssured.given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON).
                        when().get(endpoint).
                        then().contentType(ContentType.JSON).extract().response();
    }
}
