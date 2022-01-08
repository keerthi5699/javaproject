package com.exceptions;

public class Ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=20;
int b=0;
int c;
String  name="null";
c=a/b;
try{
	try
	{
System.out.println(c);
}
	catch(Exception e)
	{
		System.out.println(e);
		}
	}

finally{
	System.out.println(name);
}

	}

}
