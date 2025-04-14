package com.MyApiProject.ex_TestNgPrograms_05;

import io.qameta.allure.Description;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNg_Parameter_Keyword {



    @Parameters("Browser")
    @Test
    @Description("Set up the browser")
    public void setUp(String value){

        switch (value)
        {
            case "Chrome":
                System.out.println("Start chrome browser");
            break;

            case "FireFox":
                System.out.println("Start FireFox browser");

        }



    }
}
