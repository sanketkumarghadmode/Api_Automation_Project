package com.MyApiProject.ex_HTTP_Methods_04;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DeleteRequest {


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableresponse;


    @Test()
    @Description("Verify the delete booking id - delete method")
    public void verify_delete_bookingId(){

        String bookingId     = "511";
        String token = "7b2de448a52f951";


        requestSpecification  = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingId);

        requestSpecification.cookie("token", token);
        requestSpecification.contentType(ContentType.JSON);

        response = requestSpecification.when().delete();

        validatableresponse = response.then().log().all().statusCode(201);


    }

}
