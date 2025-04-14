package com.MyApiProject.ex_TestNgPrograms_05;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestNg_TimeOut_Keyword {



    @Test(timeOut = 2000)
    @Description("method take time then we can set the time out")
    public void verify_testCase_001(){

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("taken time");

    }

    @Test()
    @Description("Verify the method 002")
    public void verify_testCase_002(){

        System.out.println("Method 002");
    }

}
