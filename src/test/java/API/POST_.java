package API;


import io.restassured.RestAssured;
import io.restassured.specification.RequestSender;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class POST_ {

    @Test
    public void getResponseStatus(){
        String url = "http://demo.guru99.com/V4/sinkministatement.php";

         int statusCode  =  RestAssured.given()             //storing HTTP status code inside int data type
                .queryParam("CUSTOMER_ID","68195")   //
                .queryParam("PASSWORD","1234!")      //
                .queryParam("Account_No","1")        //
                 .when().get(url).getStatusCode();              //Action after given the param When means
                                                               //when u setup payload go call url and get status  code

        System.out.println("The response status is "+statusCode);  //out print to console status code

        RestAssured.given().when().get(url).then().assertThat().statusCode(200);//empty payload to do assertion and compare status code with expected

    }
    @Test
    public static void getResponseBody2(){

        RestAssured.given()
                .queryParam("CUSTOMER_ID","68195")
                .queryParam("PASSWORD","1234!")
                .queryParam("Account_No","1")
                .when().get("http://demo.guru99.com/V4/sinkministatement.php").then().log()
                .body();
    }
    @Test
    public static void getResponseHeaders(){
        System.out.println("The headers in the response "+
                RestAssured.get("http://demo.guru99.com/V4/sinkministatement.php").then().extract()
                        .headers());

    }

    @Test
    public static void getResponseTime(){
        System.out.println("The time taken to fetch the response "+RestAssured.get("http://demo.guru99.com/V4/sinkministatement.php")
                .timeIn(TimeUnit.MILLISECONDS) + " milliseconds");

    }
    @Test
    public static void getResponseContentType(){
        System.out.println("The content type of response "+
                RestAssured.get("http://demo.guru99.com/V4/sinkministatement.php").then().extract()
                        .contentType());
    }
    @Test
    public static void getSpecificPartOfResponseBody(){

        ArrayList<String> amounts = RestAssured.when().get("http://demo.guru99.com/V4/sinkministatement.php")
                .then().extract().path("result.statements.AMOUNT") ;
        int sumOfAll=0;
        for(String a:amounts){

            System.out.println("The amount value fetched is "+a);
            sumOfAll=sumOfAll+Integer.valueOf(a);
        }
        System.out.println("The total amount is "+sumOfAll);

    }
    }
