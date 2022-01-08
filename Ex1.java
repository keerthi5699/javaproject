package com.buffer;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi = new FileInputStream("C://Users//pandiyan//Desktop//ioexeptions//Java.text5");
		BufferedInputStream bis = new BufferedInputStream(fi);
		int i =0;
		while((i=bis.read())!=-1)
		{
			System.out.print((char)i);
		}
bis.close();
	}

}
