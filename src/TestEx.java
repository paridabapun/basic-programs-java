public class TestEx {

	public int occurenceOfString(String input, char c) {
		int count = 0;
		for (int i = 1; i < input.length(); i++) {

			if (c == input.charAt(i)) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {

		TestEx obj = new TestEx();
		int count = obj.occurenceOfString("My name is Bhagbaata", 'a');
		System.out.println(count);

	}

}
