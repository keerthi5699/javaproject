package com.exceptions;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ;
		Scanner scn = new Scanner(System.in);
		System.out.println("enter name");
		name = scn.nextLine();
		System.out.println(name);
		try{
         System.out.println(name.charAt(9));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
