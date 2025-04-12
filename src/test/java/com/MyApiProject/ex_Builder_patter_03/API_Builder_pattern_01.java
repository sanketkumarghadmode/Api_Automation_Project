package com.MyApiProject.ex_Builder_patter_03;

public class API_Builder_pattern_01 {

public API_Builder_pattern_01 step1()

{
    System.out.println("step1");
    return this;
}

public API_Builder_pattern_01 step2(){
    System.out.println("step2");
    return this;
}

public API_Builder_pattern_01 step3(String name){
        System.out.println(name);
        return this;
    }


public static void main(String [] args)
{
    API_Builder_pattern_01 obj = new API_Builder_pattern_01();
    obj.step1().step2().step3("step3");

}



}
