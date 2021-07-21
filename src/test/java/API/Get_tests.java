package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Get_tests {

    @Test
    public void get(){

       Response response= RestAssured.get("https://reqres.in/api/users/2");



    }
}
