package com.exceptions;

public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name=null ;
try{
System.out.println(name.length());
}
/*everything inside finally block will gets displayed . 
but, things outside the finlly blocks will not gets displayed without catch*/
finally{
System.out.println("hello");
}
System.out.println("keera");
	}

}
