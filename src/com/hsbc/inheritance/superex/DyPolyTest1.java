package com.hsbc.inheritance.superex;

class P

{

  void funP(int x)

  {

    int sum = 0;

    for(int i = 0 ; i <= x ; i++)

    {
      sum = sum + 1;
    }

    System.out.println("Sum of " + x + " no's :" + sum);

  }

}

class Q extends P

{

  void funP(int x)

  {
    int sq = 0;

    for(int i = 0 ; i <= x ; i++)

    {
      sq = x * x;
    }

    System.out.println("Square of " + x + " no's :" + sq);
  }

}

class R extends P

{

  void funP(int x)

  {
    int fact = 1;

    for(int i = 1 ; i <= x ; i++)

    {
      fact = fact * i;
    }

    System.out.println("Factorial of " + x + " no's :" + fact);
  }

}


class DyPolyTest1

{

   public static void main(String args[])

   {
     int i = Integer.parseInt(args[0]);

     int x = Integer.parseInt(args[1]);

     P p1 = null;

     if(i > 0 && i <= 10)

         p1 = new P();

     if(i > 10 && i <= 20)

         p1 = new Q();

     if(i > 20)

         p1 = new R();
     

     p1.funP(x);
   }

}


















