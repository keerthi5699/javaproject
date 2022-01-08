package com.exceptions;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World..!");
		
		//input variables
		int a = 50, b = 0;
		
		/**
		 * Exception Handling: The process of maintaining normal flow of
		 * ==================  java program execution.
		 */
		
		/*
		 * Exception Handling Constraints: try, catch, finally, throw and
		 * ==============================  throws
		 */
		
		try
		{
			int c = a/b;//infinite
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		
		System.out.println("---------------------");
		
		System.out.println(a);
		
		System.out.println("---------------------");
		
		System.out.println(b);


	}

}
