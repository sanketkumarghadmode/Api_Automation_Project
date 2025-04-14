package com.MyApiProject.ex_HTTP_Methods_04;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PatchRequest {


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;


    @Test()
    @Description("Verify the update user name - patch request")
    public void VerifyUpdate_user_name(){

        String token = "642d60beb3a0a4c";
        String bookingId = "796";
        String body = "{\n" +
                "    \"firstname\" : \"Sanket\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingId);

        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token",token);
        requestSpecification.body(body);

        response = requestSpecification.when().patch();

        validatableResponse = response.then().log().all().statusCode(200);






    }

}
