package com.hsbc.inheritance.superex;
class MethodOverridingTest2

{

   public static void main(String args[])

   {
      Btest1 b1 = new Btest1();

      b1.fun2();

      b1.fun3();

      b1.fun5();

      b1.fun6();

      System.out.println();

      Btest1 b2 = new Ctest1();

      b2.fun2();

      b2.fun3();

      b2.fun5();

      b2.fun6();

      System.out.println();

      Btest1 b3 = new Dtest1();

      b3.fun2();

      b3.fun3();

      b3.fun5();

      b3.fun6();
   }

}
