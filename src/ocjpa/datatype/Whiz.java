package ocjpa.datatype;

public class Whiz {

	public static void main(String[] args) {
		
		//What is teh o/p --

		Integer integer = Integer.decode("10");
		Integer integer2 = new Integer("20");
		Integer integer3 = Integer.valueOf("30");
		
//		double d1 = 1_2_2.7;
//		can underscore write in a number

		System.out.println(integer + integer2 + integer3);
	}

}
