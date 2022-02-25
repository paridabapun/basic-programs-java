package com.hsbc.array;
//Command line argument
public class CommandLineArgument {

	public static void main(String[] args) {
		int n = args.length;
		System.out.println("No of argument " + n);
		System.out.println(" the arguments are :");
		for (int i = 0; i < n; i++)
			System.out.println(args[i]);
	}

}
