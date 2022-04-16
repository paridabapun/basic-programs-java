package com.hsbc.stringwrittenquestion;

public class StringCheck {

	public static void main(String[] args) {

		String string = "India is great";

		char[] ch = string.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {

				ch[i] = 'V';

			}
			
		}
		
		System.out.println(ch);
	}

}
