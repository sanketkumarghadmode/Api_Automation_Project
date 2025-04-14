package com.MyApiProject.ex_PayLoadManagment_07.Map;

import io.qameta.allure.Description;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class Payload_Manage_Hasmap {

// this is just to know because this is not used it used rarely

    RequestSpecification requestSpecification;
    Response response;
    ValidatableResponse validatableResponse;

    String token;
    Integer bookingId;

    @Test()
    @Description("Verify the assertion in the post method")
    public void test_Post(){


//        String postPayload = "{\n" +
//                "    \"firstname\" : \"Jim\",\n" +
//                "    \"lastname\" : \"Brown\",\n" +
//                "    \"totalprice\" : 111,\n" +
//                "    \"depositpaid\" : true,\n" +
//                "    \"bookingdates\" : {\n" +
//                "        \"checkin\" : \"2018-01-01\",\n" +
//                "        \"checkout\" : \"2019-01-01\"\n" +
//                "    },\n" +
//                "    \"additionalneeds\" : \"null\"\n" +
//                "}";

        Map<String,Object> jsonBodyUsingMap = new LinkedHashMap();
        jsonBodyUsingMap.put("firstname","Jim");
        jsonBodyUsingMap.put("lastname","Brown");
        jsonBodyUsingMap.put("totalprice",111);
        jsonBodyUsingMap.put("depositpaid",true);

        Map<String,Object> bookingdatesMap = new LinkedHashMap();
        bookingdatesMap.put("checkin","2018-01-01");
        bookingdatesMap.put("checkout","2019-01-01");

        jsonBodyUsingMap.put("bookingdates",bookingdatesMap);
        jsonBodyUsingMap.put("additionalneeds","Food");


        System.out.println(jsonBodyUsingMap);
    }

}
