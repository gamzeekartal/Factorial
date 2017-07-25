package com.factorial;

import java.util.Scanner;

public class factorial {
	
	public static int factorial(int i){
		if(i==0)
			return 1;
		else if(i>0)
			return i*factorial(i-1);
		else
			return i*factorial(i+1);
	}
	public static void print(){
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Please enter a number: ");
	    int n = scanner.nextInt();
	    int result = factorial(n);
	    System.out.println("factorial " + n + " = " + result);
	}

	public static void main(String[] args) {
		 print();

	}

}
