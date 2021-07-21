package API;


import static  io.restassured.RestAssured.*;

import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class F1_history {

    @Test
    public void test_ResponseHeaderData_ShouldBeCorrect() {

        given().
                when().
                get("http://ergast.com/api/f1/2017/circuits.json").
                then().
                assertThat().
                statusCode(200).
                and().
                contentType(ContentType.JSON);

//        Response resp =  get("http://ergast.com/api/f1/2017/circuits.json");
//       resp.prettyPrint();
//        String text = resp.path("MRData.CircuitTable.Circuits[0].circuitId");
//        System.out.println(text);

        List<List<List<List<List>>>> list = new ArrayList<>();

    }
}
