package com.exceptions;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int ages[] = {30,23,24,19,30};
		try{
		System.out.println(ages[5]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
