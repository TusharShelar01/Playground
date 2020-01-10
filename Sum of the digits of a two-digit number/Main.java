import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int given_number = in.nextInt();
      int first_digit = given_number/10;
      int last_digit = given_number%10;
      int sum = first_digit+last_digit;
      System.out.println(sum);
      
	}
}