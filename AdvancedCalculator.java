package session2;

import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Number=");
		
		Scanner s = new Scanner(System.in);
		int a, b, sum=0, div=0;
		
		a = s.nextInt();
		b = s.nextInt();
		
		
		sum = a+b;
		System.out.println("sum = "+sum);
		
		div = a-b;
		System.out.println("div = "+div);
	}

}
