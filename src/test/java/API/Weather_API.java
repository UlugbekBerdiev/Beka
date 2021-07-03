package API;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class Weather_API {
    @Test
            public void getWeatherData() {
        String key = "&key=50dd27a11f284393b9fc1eb49208a072";
        String city = "city=Dushanbe";
        String url = "https://api.weatherbit.io";


        given().accept(ContentType.JSON)
                .when().get(url + "/v2.0/current?" + city + key)
                .then().assertThat().statusCode(200)
                .and().contentType(ContentType.JSON)

               .assertThat().body("city_name", equalTo("Dushanbe"));


        Response response = get(url + "/v2.0/current?" + city + key);
        System.out.println("Status code: - " + response.getStatusCode());
        //Assert.assertEquals(response.getStatusCode(),"200");
        System.out.println("contentType of response is : "+response.contentType());
        System.out.println(response.then().extract().statusLine());
        System.out.println(response.then().extract().time());
        System.out.println(response.then().extract());
        response.prettyPrint();
    }

}
