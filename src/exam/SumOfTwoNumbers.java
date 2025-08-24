package exam;

import java.util.Scanner;

public class SumOfTwoNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two numbers:");
		int num1,num2;
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("sum of two numbers:" + (num1+num2));

	}

}
