package com.MyApiProject.ex_TestNgPrograms_05;

import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class TestNg_DependsOnmethod_Keyword {

    @Test()
    @Description("Verify the logo displayed correctly ")
    public void verify_the_company_logo()
    {
        System.out.println("Logo displayed");
    }

    @Test()
    @Description("Verify the login page")
    public void verify_login_with_validInputes()
    {
        System.out.println("User logged in ");

    }

    @Test(dependsOnMethods = "verify_login_with_validInputes")
    @Description("Verify user should redirect to the dashboard page")
    public void Verify_dashbaord_page()
    {
        System.out.println("User landed  on the dashbaord page");
    }



}
