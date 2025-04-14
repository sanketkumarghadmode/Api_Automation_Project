package com.MyApiProject.ex_TestNgPrograms_05;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg_AlwaysRun_Keyowrd {


    @Test()
    @Description("Test case one")
    public void verify_testCase_01(){

        Assert.fail();
       // System.out.println("test case 1");

    }

    @Test(dependsOnMethods = "verify_testCase_01", alwaysRun = true)
    @Description("Always Run test case")
    public void verify_testCase_02(){

        System.out.println("Dashbaord test case");

    }


}
