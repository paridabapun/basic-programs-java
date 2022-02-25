package com.hsbc.mcqs;
//Deutsche Bank
public class MCQ7 {

    public static void main(String[] args) {
        Sub s1=new Sub(); Sub s2=new Sub(); Sub s3=new Sub();
        System.out.println(s1.num+s2.num+s3.num);

    }
}

class Sub{
    public static  Integer num=10;
    Sub(){
        num=num+1;
    }
}
