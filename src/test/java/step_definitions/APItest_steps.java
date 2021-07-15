package step_definitions;

import cucumber.api.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class APItest_steps {
     String and_point = "http://dummy.restapiexample.com/api/v1/employee";
     Response response;
   int employeeID =1;

     @Test
    public void apiTest(){
         response = given().accept(ContentType.JSON)
                 .get(and_point+"/"+employeeID);
         response.prettyPrint();

         Assert.assertEquals(response.statusCode(), 200);
         Assert.assertEquals(response.path("employee_name"), "Tiger Nixon");




     }




}
