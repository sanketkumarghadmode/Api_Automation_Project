package com.MyApiProject.ex_TestNgPrograms_05;

import org.testng.annotations.Test;

public class TestNgGroups {



    @Test(groups = {"sanity", "reg" })
    public void method_001()
    {
        System.out.println("Method 1");
    }


    @Test(groups = {"Functional"})
    public void method_002()
    {
        System.out.println("Method 2");
    }

    @Test(groups = {"UAT, reg"})
    public void method_003()
    {
        System.out.println("Method 3");
    }

    @Test(groups = {"sanity"})
    public void method_004()
    {
        System.out.println("Method 4");
    }

}
