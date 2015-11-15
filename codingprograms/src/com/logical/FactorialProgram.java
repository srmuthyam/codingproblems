package com.logical;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialProgram {

	private static Scanner input;

	public static void main(String[] args) {

		System.out.println("Please enter the number for factorial:");
		input = new Scanner(System.in);
		if(!input.hasNextInt()){
			try {
				throw new Exception("invalid input please enter a  integer value");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				
			}
		}
		int data = input.nextInt();
		System.out.println("input value is :"+data);
		FactorialProgram factProg = new FactorialProgram();
		factProg.printFactorial(data);
	}

	private void printFactorial(int input) {
		BigInteger fact = new BigInteger("1");
		if (input < 0) {
			System.out.println("Return valid input ");
		} else if (input == 0 || input == 1) {
			System.out.println("Factorial is :  " + fact);

		} else {
			for (int i = 1; i <= input; i++) {
				fact = fact.multiply(new BigInteger("" + i));
			}
			System.out.println("Factorial of "+input+" is : "+fact);
		}

	}

}
