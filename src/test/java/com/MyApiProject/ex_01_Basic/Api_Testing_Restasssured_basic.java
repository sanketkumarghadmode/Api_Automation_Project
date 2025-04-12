package com.MyApiProject.ex_01_Basic;

import io.restassured.RestAssured;

public class Api_Testing_Restasssured_basic {


    public static void main(String[] args) {



        // log.all is function which log everything in console

        RestAssured.given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/560016")
                .when().get()
                .then().log().all().statusCode(200);
    }
}
