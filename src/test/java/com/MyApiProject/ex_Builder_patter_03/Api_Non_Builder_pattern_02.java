package com.MyApiProject.ex_Builder_patter_03;

public class Api_Non_Builder_pattern_02 {


    public void step1(){
        System.out.println("step1");
    }

    public void step2(){
        System.out.println("step2");
    }
    public void step3(String name){

        System.out.println(name);
    }

    public static void main(String [] args)
    {
        Api_Non_Builder_pattern_02 obj = new Api_Non_Builder_pattern_02();
        obj.step1();
        obj.step2();
        obj.step3("sanket");
    }


}
