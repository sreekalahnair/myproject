package myproject;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("enter the first number");
		Scanner s = new Scanner(System.in);
		int num1= s.nextInt();
		System.out.println("enter second number");
		int num2 = s.nextInt();
		System.out.println("enter operation");
	
		int sum =  num1+  num2;
		int difference = num1-num2;
		int multiply = num1*num2;
		int division = num1/num2;
		
System.out.println("sum =" + sum);
System.out.println("difference="+ difference);
System.out.println("multiplication =" + multiply);
System.out.println("division" + division);


	}

}
