package com.MyApiProject.ex_HTTP_Methods_04;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Post_Request {


    RequestSpecification rs;
    Response response;
    ValidatableResponse vr;


    @Test()
    @Description("Verify the create token post request")
    public void Post_No_BDD_style_create_Token()
    {

        String bodyPayload = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";


// Part1  = Pre Condition  - Preparing request - Url, headers  auth...
        rs = RestAssured.given();
        rs.baseUri("https://restful-booker.herokuapp.com");
        rs.basePath("/auth");

        rs.contentType(ContentType.JSON);
        rs.body(bodyPayload);

//  Making Https Request = the post request part2
        response = rs.when().log().all().post();

// Verification part3
        vr =  response.then().log().all();
        vr.statusCode(200);
    }

}
