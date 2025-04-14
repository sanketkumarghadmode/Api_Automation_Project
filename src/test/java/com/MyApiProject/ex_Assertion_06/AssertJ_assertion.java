package com.MyApiProject.ex_Assertion_06;
import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJ_assertion {


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    String token;
    Integer bookingId;

    @Test()
    @Description("Verify the assertion in the post method")
    public void test_Post(){


        String postPayload = "{\n" +
                "    \"firstname\" : \"Jim\",\n" +
                "    \"lastname\" : \"Brown\",\n" +
                "    \"totalprice\" : 111,\n" +
                "    \"depositpaid\" : true,\n" +
                "    \"bookingdates\" : {\n" +
                "        \"checkin\" : \"2018-01-01\",\n" +
                "        \"checkout\" : \"2019-01-01\"\n" +
                "    },\n" +
                "    \"additionalneeds\" : \"null\"\n" +
                "}";

        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");

        requestSpecification.cookie("token", token);
        requestSpecification.body(postPayload).log().all();
        requestSpecification.contentType(ContentType.JSON);

        response = requestSpecification.when().post();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);


        bookingId = response.then().extract().path("bookingid");
        String firstname  = response.then().extract().path("booking.firstname");
        String lastname  = response.then().extract().path("booking.lastname");


        assertThat(bookingId).isNotNull().isNotNegative();
        assertThat(firstname).isNotNull().isNotEmpty().isNotBlank();



    }
}
