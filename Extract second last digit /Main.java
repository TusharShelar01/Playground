import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Find the 2nd last digit of given number
      Scanner in = new Scanner(System.in);
      int given_number = in.nextInt();
      int second_lastdigit = (given_number/10)%10;
      System.out.println(second_lastdigit);
	}
}