package com.exceptions;

public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = null;
		try{
		System.out.println(text.length());
		}
		catch(Exception e){
		System.out.println(e);
		}
		// finally block part will get printed whatever it has inside. finally keyword can be used with try , catch.
		finally{
			int a=10;
			int b=90;
			int c =a+b;
			System.out.println(c);
			
		}
		
	}

}
