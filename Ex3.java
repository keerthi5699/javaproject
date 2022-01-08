package com.exceptions;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Hello";
		try{
		System.out.println(name.charAt(10));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
