package com.MyApiProject.ex_PayLoadManagment_07.Gson;

import com.google.gson.Gson;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Api_Testing_Gson {


    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    @Test()
    public void test_Create_Booking_Positive() {

        Booking booking = new Booking();
        booking.setFirstname("sanket");
        booking.setLastname("Ghadmode");
        booking.setTotalprice(120);
        booking.setDepositpaid(true);

        Bookingdates bookingdates = new Bookingdates();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");
        booking.setBookingdates(bookingdates);

        booking.setAdditionalneeds("Food");

        Gson gson = new Gson();
        String jasonObject =  gson.toJson(booking);




        requestSpecification = RestAssured.given();
        requestSpecification.baseUri("https://restful-booker.herokuapp.com");
        requestSpecification.basePath("/booking");
        requestSpecification.body(jasonObject);
        requestSpecification.contentType(ContentType.JSON);


        response = requestSpecification.when().post();
        String jasonResponseString = response.asString();

        validatableResponse = response.then().log().all();
        validatableResponse.statusCode(200);

        // step 1 to extract the value
        String firstname1 = response.then().extract().path("booking.firstname");
        System.out.println(firstname1);

        Assert.assertEquals(firstname1,"sanket");


        //  Step 2 another way of extraction is jasonPath class

        JsonPath jsonPath = new JsonPath(response.asString());
        String bookingId = jsonPath.getString("bookingId");
        String firstname2 = jsonPath.getString("booking.firstname");
        boolean depositpaid1 = jsonPath.getBoolean("booking.depositpaid");

        System.out.println(depositpaid1);


        // Step 3 to extract by suing de-serialization
        // We used in our framework this only
        BookingResponse bookingResponse = gson.fromJson(jasonResponseString, BookingResponse.class);

        System.out.println( bookingResponse.getBookingdates());
        System.out.println(bookingResponse.getAdditionalneeds());
        System.out.println(bookingResponse.getFirstname());




    }
}
