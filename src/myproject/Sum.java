package myproject;
import java.util.Scanner;
public class Sum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter  1st number");
		int num1 = s.nextInt();
		System.out.println("enter 2nd number");
		int num2 = s.nextInt();
		int sum = num1+num2;
		System.out.println("sum ="+ sum);
		

	}

}
