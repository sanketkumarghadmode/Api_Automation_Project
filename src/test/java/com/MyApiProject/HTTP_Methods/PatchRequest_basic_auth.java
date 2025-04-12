package com.MyApiProject.HTTP_Methods;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PatchRequest_basic_auth {

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableresponse;


    @Test()
    @Description("Verify the update booking - put - basic auth")
    public void Verify_the_Update_Booking(){
        String token = "8d59731d5328c0d";
        String bookingId = "158";
        String body = "{\n" +
                "    \"firstname\" : \"sanket\"\n" +
                "}";



        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingId);


        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);
        requestSpecification.auth().basic("admin","password123");
        requestSpecification.body(body);

        response = requestSpecification.when().patch();

        validatableresponse = response.then().log().all().statusCode(200);

    }


}
