package com.hsbc.logicalquestion;
public class ReverseStringTest {

	public static String reverse(String source) {
		if (source == null || source == "") {
			return source;
		} else {
			String reverse = "";
			for (int i = source.length() - 1; i >= 0; i--) {
				reverse = reverse + source.charAt(i);
			}
			return reverse;
		}

	}

	public static void main(String[] args) {
		String name = "bhagabata";
		StringBuffer buffer = new StringBuffer(name);
		buffer.reverse();
		System.out.println(buffer);
		StringBuilder builder = new StringBuilder(name);
		builder.reverse();
		System.out.println(builder);
		/*
		 * String source="Rajaloka"; for(int i=source.length()-1;i<0;i--){
		 * System.out.print(source.charAt(i)); }
		 */
		String src = "bapun";
		String revString = reverse(src);
		System.out.println(revString);

		String palsource = "MOMT";
		StringBuffer stringBuffer = new StringBuffer(palsource);
		String finasource = stringBuffer.reverse().toString();
		if (palsource.equalsIgnoreCase(finasource)) {
			System.out.println("No i s palindrome");

		} else {
			System.out.println("No is not palindrome");
		}
		
		String stg="Bhagabata";
		System.out.println(stg.charAt(0));
		System.out.println(stg.substring(1));
	}
}
