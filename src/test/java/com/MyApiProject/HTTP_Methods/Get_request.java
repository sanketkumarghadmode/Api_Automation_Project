package com.MyApiProject.HTTP_Methods;

import io.qameta.allure.Description;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class Get_request {

     RequestSpecification rs;
     Response response;
     ValidatableResponse vr;


     @Test()
     @Description("Positive test vase using NonBDD Style")
     public void test_NonBDD_Get(){

         String pincode = "560016";

         rs = RestAssured.given();
                 rs.baseUri("https://api.zippopotam.us");
                 rs.basePath("/IN/"+pincode);

         response = rs.when().log().all().get();

         vr = response.then().log().all().statusCode(200);

     }

     @Test()
    @Description("Negitive Test Case")
    public void Verify_pin_with_Negitive_num()
     {
         String pincode = "-1";

         rs = RestAssured.given();
         rs.baseUri("https://api.zippopotam.us");
         rs.basePath("/IN/"+pincode);

         response = rs.when().log().all().get();

         vr = response.then().log().all().statusCode(200);

     }


}
