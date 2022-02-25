package com.hsbc.inheritance.superex;

class E extends D

{
  int a,b;

  E()

  {
    super(3);

    /* here we are explicitly calling the the parameterised constructor
     of class D defined to accept an integer value */
    
    System.out.println("*** E() of E ***");

  }

  void fun1()

  {
   // super(3);//error: call to super must be the first statement in the constructor

   /* A constructor can only be called explicitly by using asuper keyword
    from a constructor not from any method */
    
    System.out.println("*** fun1() of E ***");
  }

  public static void main(String args[])

  {
    E e1 = new E();

    System.out.println("Content of variable i present in the object of class D :" + e1.i);

    System.out.println("Content of variable j present in the object of class D :" + e1.j);
  }
}
