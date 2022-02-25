package com.hsbc.inheritance.superex;
class ReferenceTypecastingTest1

{

   public static void main(String args[])

   {
     Atest1 a1 = new Dtest1();

     a1.fun1();

     a1.fun2();

     a1.fun3();

     a1.fun4();

     System.out.println();

     Dtest1 d1 = (Dtest1)a1 ;

     d1.fun1();

     d1.fun3();

   }

}
