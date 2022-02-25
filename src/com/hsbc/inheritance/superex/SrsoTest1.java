package com.hsbc.inheritance.superex;

class M

{

  int i,j;

  static void funM()

  {
    System.out.println("***  static funM() of M ***");
  }

  void funN()

  {
    System.out.println("*** funN() of M ***");
  }

}

class N extends M

{

  int i,k;

  static void funM()

  {
    System.out.println("*** static funM() of N ***");
  }

  void funN()

  {
    System.out.println("*** funN() of N ***");
  }

  void fun1()

  {
    System.out.println("*** fun1() of N ***");
  }

}


class SrsoTest1

{

  public static void main(String args[])

  {
    M m1 = new N();

    m1.funM();

    m1.funN();

    m1.i = 6;
	System.out.println(m1.i);
	

    System.out.println(m1);

    N n1 = new N();

    n1.funM();

    n1.funN();

    System.out.println(n1);

    Object ob = new A();

    System.out.println(ob);

  }

}