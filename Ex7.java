package com.exceptions;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name=null ;
		try{
		System.out.println(name.length());
		}
		/*only with catch things outside the finally like "keera" gets displayed*/
		catch (Exception e)
		{
			System.out.println(e);
		}
		finally{
		System.out.println("hello");
		}
		System.out.println("keera");


	}

}
