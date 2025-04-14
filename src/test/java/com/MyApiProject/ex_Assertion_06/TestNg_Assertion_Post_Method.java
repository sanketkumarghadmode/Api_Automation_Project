package com.MyApiProject.ex_Assertion_06;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg_Assertion_Post_Method {


    // In the TestNg There are two type of assert
    // Hard assert and soft assert

    // Hard assert : Hard assert throws the assert error immediately
    // after the assertion fail and not execute respective assertion

    // Soft assert :  Soft assert not throws the assert error immediately it will check all
    // the assert and then mark the test case fail
    // to use the soft assert we need to create the object SoftAssert softassert = new SoftAssert();
    // and at the end we need to declare the assertAll method if we are not mentioned
    // it then we can see the abrupt behaviour



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

        // here we need to extract the response which we want to validate

        bookingId = response.then().extract().path("bookingid");
        String firstname = response.then().extract().path("booking.firstname");
        String lastname = response.then().extract().path("booking.lastname");

        // Header validation
       String contentType = response.getContentType();

        Assert.assertEquals(contentType,"application/json; charset=utf-8");
        Assert.assertEquals(firstname,"Jim");
        Assert.assertNotNull(bookingId);







//        // all the method of Hard assert
//        Assert.assertEquals("Jim","Jim");
//        Assert.assertNull(bookingId);
//        Assert.assertNotNull(bookingId);
//        Assert.assertNotEquals("Brown","Browed");
//        Assert.assertFalse(true);
//        Assert.assertTrue(false);
//
//
//        // Soft Assert
//
//        SoftAssert softassert = new SoftAssert();
//        softassert.assertEquals("Jim","Jim");
//        softassert.assertNotEquals("Brown","Ghadmode");
//        softassert.assertNull(bookingId);
//        softassert.assertFalse(true);
//
//        softassert.assertAll();



    }


}
