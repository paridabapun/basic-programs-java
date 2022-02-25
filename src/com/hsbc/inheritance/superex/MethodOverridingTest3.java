package com.hsbc.inheritance.superex;
class MethodOverridingTest3

{

   public static void main(String args[])

   {
     Ctest1 c1 = new Ctest1();

     c1.fun5();

     c1.fun6();

     c1.fun7();

     c1.fun8();

     System.out.println();

     Ctest1 c2 = new Dtest1();

     c2.fun5();

     c2.fun6();

     c2.fun7();

     c2.fun8();

     System.out.println();

     
   }
   
}
