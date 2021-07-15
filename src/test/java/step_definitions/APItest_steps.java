package step_definitions;

import cucumber.api.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class APItest_steps {
     String end_point = "http://dummy.restapiexample.com/api/v1/employee";
     Response response;
   int employeeID =1;

     @Test
    public void apiTest(){
         response = given().accept(ContentType.JSON)
                 .get(end_point+"/"+employeeID);
         response.prettyPrint();
Integer id =1;

         Assert.assertEquals(200,response.statusCode());
         Assert.assertEquals("Tiger Nixon",response.path("data.employee_name"));
         Assert.assertEquals( id,response.path("data.id"));


     }




}
