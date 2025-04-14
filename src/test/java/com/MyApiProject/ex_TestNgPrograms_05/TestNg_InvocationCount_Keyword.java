package com.MyApiProject.ex_TestNgPrograms_05;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestNg_InvocationCount_Keyword {


    @Test(invocationCount = 5)
    @Description("Verify the test case run 5 time")
    public void verify_methodExecute_5times(){

        System.out.println("Method executed") ;
    }

}
