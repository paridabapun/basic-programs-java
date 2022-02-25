package com.hsbc.mcqs;
//Deutche Bank
class TestA{
    public void start(){
        System.out.println("TestA");
    }
}

public class MCQ10  extends  TestA{

    public void start(){
        System.out.println("TestB");
    }

    public static void main(String[] args) {
        ((TestA)new MCQ10()).start();
    }
}
