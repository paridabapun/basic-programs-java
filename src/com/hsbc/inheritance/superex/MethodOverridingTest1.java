package com.hsbc.inheritance.superex;
class MethodOverridingTest1

{

   public static void main(String args[])

   {
      Atest1 a1 = new Atest1();

      a1.fun1();

      a1.fun2();

      a1.fun3();

      a1.fun4();

      System.out.println();
	  System.out.println("Atest1 a2 = new Btest1()");

      Atest1 a2 = new Btest1();

      a2.fun1();

      a2.fun2();

      a2.fun3();

      a2.fun4();

      System.out.println("Atest1 a3 = new Ctest1();");

      Atest1 a3 = new Ctest1();

      a3.fun1();

      a3.fun2();

      a3.fun3();

      a3.fun4();

      System.out.println("Atest1 a4 = new Dtest1();");

      Atest1 a4 = new Dtest1();

      a4.fun1();

      a4.fun2();

      a4.fun3();

      a4.fun4();
   }

}
