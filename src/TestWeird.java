import java.util.Scanner;

public class TestWeird {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		String name=scanner.next();
		scanner.close();
		
		if(number % 2 == 1 || number >= 6 && number <= 20) {
			System.out.println("Weird");
		}
		else {
			System.out.println("Not Weired");
		}
	}

}
