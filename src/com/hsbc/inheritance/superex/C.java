package com.hsbc.inheritance.superex;

class A

{
	int i, j;

	void funA()

	{
		System.out.println("*** funA() of A ***");
	}
}

class B extends A

{
	int i, k;

	void funA()

	{
		System.out.println("*** funA() of B ***");
	}

	void funB()

	{
		super.i = 111;

		System.out.println("Value of i of A :" + super.i);

		System.out.println("*** funB() of B ***");
	}
}

class C extends B

{
	int i, j;

	void funA()

	{
		System.out.println("*** funA() of C ***");
	}

	void funC()

	{
		System.out.println("*** Beginning of funC() of C ***");

		i = 6;

		super.i = 3;

		System.out.println("Value of i of B :" + super.i);

		funA();

		super.funA();

		j = 7;

		super.j = 113;

		System.out.println("Value of j of A :" + super.j);

		System.out.println("*** End of funC() of C ***");
	}

	public static void main(String args[])

	{
		C c1 = new C();

		c1.funC();

		System.out.println();

		System.out.println("Value of i :" + c1.i);

		System.out.println("Value of j :" + c1.j);

		System.out.println("Value of k :" + c1.k);

		// System.out.println(super.j);
	}
}
