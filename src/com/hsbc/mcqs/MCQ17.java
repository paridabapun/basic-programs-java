package com.hsbc.mcqs;

class Two{
    byte x;
}

//Deutche Bank
public class MCQ17 {

    void start(){
        Two t=new Two();
        System.out.println(t.x+"");
        Two t2=fix(t);
        System.out.println(t.x+""+t2.x);

    }
    Two fix(Two two){
        two.x=42;
        return two;
    }
    public static void main(String[] args) {
        MCQ17  mcq17=new MCQ17();
        mcq17.start();
    }


}

