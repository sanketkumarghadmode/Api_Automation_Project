package com.MyApiProject.ex_HTTP_Methods_04;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PutRequest {


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test()
    @Description("Verify the restfull booker Update Booking - Put Method")
    public void Verify_UpdateBooking()
    {
        String token = "80ca9014a368885";
        String bookingId = "4275";
        String body= " {\n" +
                "        \"firstname\": \"Sanket\",\n" +
                "        \"lastname\": \"Ghadmode\",\n" +
                "        \"totalprice\": 30000,\n" +
                "        \"depositpaid\": true,\n" +
                "        \"bookingdates\": {\n" +
                "            \"checkin\": \"2018-01-01\",\n" +
                "            \"checkout\": \"2019-01-01\"\n" +
                "        },\n" +
                "        \"additionalneeds\": \"scale\"\n" +
                "    }";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking/"+bookingId);

        requestSpecification.body(body).log().all();
        requestSpecification.contentType(ContentType.JSON);
        requestSpecification.cookie("token", token);

        response = requestSpecification.when().put();

        validatableResponse = response.then().log().all().statusCode(200);



    }

}
