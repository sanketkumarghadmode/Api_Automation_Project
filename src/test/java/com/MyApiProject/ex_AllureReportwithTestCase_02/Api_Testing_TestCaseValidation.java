package com.MyApiProject.ex_AllureReportwithTestCase_02;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Api_Testing_TestCaseValidation {


    @Test()
    @Description("TC_01 To verify the pin code with valid input")
    public void verify_ValidPineCode()
    {

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016")
                .when().get()
                .then().log().all().statusCode(200);
    }

    @Test()
    @Description("To verify the the pin code with negitive number")
    public void Verify_PinCodewithNegitiveNumber() {

        RestAssured.given()
                .basePath("https://api.zippopotam.us")
                .baseUri("/IN/-560016")
                .when().get()
                .then().log().all().statusCode(200);
    }


    @Test()
    @Description("Verify the pin cod with empty input")
    public void Verify_PinCodewithEmptyInput()
    {
       RestAssured.given()
               .baseUri("https://api.zippopotam.us")
               .basePath("/IN/ ")
               .when().get()
               .then().log().all().statusCode(200);
    }
}


