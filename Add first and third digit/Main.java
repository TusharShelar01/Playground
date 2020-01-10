import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Given number will be of the three digit
      Scanner in = new Scanner(System.in);
      int given_number =in.nextInt();
      int First_digit = given_number/100;
      int Third_digit = given_number%10;
      int result = First_digit + Third_digit;
      System.out.println(result);
	}
}