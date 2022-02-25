package com.hsbc.mcqs;

import javax.xml.transform.sax.SAXSource;

class Super{

    public int i=0;
    public Super(String text){
    i=1;
    }
}
public class MCQ18 extends  Super {

    public MCQ18(String text){
//        super(text);
        super(text);
        i=2;
    }

    public static void main(String[] args) {
        MCQ18 mcq18=new MCQ18("Hello");
        System.out.println(mcq18.i);

    }

}
