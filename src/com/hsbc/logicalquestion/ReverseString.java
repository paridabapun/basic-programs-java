package com.hsbc.logicalquestion;

public class ReverseString {

	public static String reverse(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		} else {
			String reverse = "";
			for (int i = source.length() - 1; i >= 0; i--) {
				reverse = reverse + source.charAt(i);

			}
			return reverse;
		}

	}

	public static String recurssionMethod(String source) {
		if (source == null || source.isEmpty()) {
			return source;
		} else {
			System.out.println("Inside Recussion method");
//			return recurssionMethod(source.substring(1) + source.charAt(1));
			return "abc";

		}

	}

	public static void main(String[] args) {
		String org = "BHAGABATA";
		System.out.println(org.length());
		String rev = new StringBuffer(org).reverse().toString();
		System.out.println(rev);
		System.out.println(rev.length());

		String org2 = "Jagannath";
		String rev2 = new StringBuilder(org2).reverse().toString();
		System.out.println(rev2);
		String revString = reverse("Bhagabata");
		System.out.println(revString);
		String src = recurssionMethod("Baba");
		System.out.println(src);
	}

}
