package exam;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a, b;
		System.out.println("Enter first number:");
		a=sc.nextInt();
		System.out.println("Enter second number:");
		b=sc.nextInt();
		System.out.println("Sum of two numbers is:"+(a+b));
	}

}
