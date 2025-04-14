package com.MyApiProject.ex_TestNgPrograms_05;

import org.testng.annotations.Test;

public class TestNg_Priority_Keyword {



    @Test(priority = 1)
    public void method_001()
    {
        System.out.println("Method 1");
    }


    @Test(priority = 4)
    public void method_002()
    {
        System.out.println("Method 2");
    }

    @Test(priority = 2)
    public void method_003()
    {
        System.out.println("Method 3");
    }

    @Test(priority = 3)
    public void method_004()
    {
        System.out.println("Method 4");
    }

}
