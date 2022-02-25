package com.hsbc.mcqs;
//Deutche bank
public class MCQ13 {
    public static void main(String[] args) {
        Myclass obj=new Myclass();
        int a=10;
        int b=20;
        obj.meth(a,b);
        System.out.println(a+ "  " +b);
    }
}
class Myclass{
    int a;
    int b;
    void meth(int i, int j){
        i*=2;
        j/=2;
    }
}
