package com.MyApiProject.ex_TestNgPrograms_05;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestNg_Enable_KeyWord {


    @Test(enabled = false)
    @Description("Enable false which exclude the test case it means test case will not run")
    public void Verify_the_testcase_01(){

        System.out.println("Test case will not run");
    }


    @Test(enabled = true)
    @Description("Enabled true will run the test case")
    public void Verify_the_testcase_02(){

        System.out.println("Test case will run ");
    }


}
