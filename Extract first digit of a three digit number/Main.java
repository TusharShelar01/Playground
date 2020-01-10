import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int given_number = in.nextInt();
      int first_digit = given_number/100;
      System.out.println(first_digit);
	}
}