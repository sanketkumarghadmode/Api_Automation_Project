package com.MyApiProject.ex_TestNgPrograms_05;

import org.testng.annotations.*;

public class All_Annotations {


    @BeforeSuite
    public void test_verify_001()
    {
        System.out.println("Befor suite");
    }

    @BeforeTest
    public void test_verify_002()
    {
        System.out.println("Before the Test");
    }

    @BeforeGroups
    public void test_verify_003()
    {
        System.out.println("Before the Group");
    }


    @BeforeClass
    public void test_verify_004()
    {
        System.out.println("Before the class");
    }

    @BeforeMethod
    public void test_verify_005()
    {
        System.out.println("Before the method");
    }

    @Test
    public void test_Verify_00()
    {
        System.out.println(" i am the test case");
    }

    @AfterMethod
    public void set_aftermethod()
    {
        System.out.println("After method");
    }

    @AfterClass
    public void set_afterClass()
    {
        System.out.println("After Class");
    }
    @AfterGroups
    public void set_afterGroups()
    {
        System.out.println("After Class");
    }

    @AfterTest
    public void set_afterTest()
    {
        System.out.println("After Test");
    }

    @AfterSuite
    public void set_afterSuite()
    {
        System.out.println("After Suite");
    }


}
