package com.MyApiProject.ex_TestNgPrograms_05;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestNg_GroupsAndPriority {


    @Test(groups = {"sanity"}, priority = 1)
    @Description("Verify the input one")
    public void test_verifytheInput1()
    {
        System.out.println("input one");
    }

    @Test(groups = {"reg"}, priority = 4)
    @Description("Verify the Last input four")
    public void test_verifytheInputFour()
    {
        System.out.println("Last inpute four");
    }

}
