package com.sep6;

import java.io.FileInputStream;
import java.io.IOException;

public class B {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\ADMIN\\OneDrive\\Desktop\\File_Handling\\db.txt";
		FileInputStream fh=null;
		
		try {
			fh=new FileInputStream(path);
			int data=fh.read();
			System.out.println(data);
			
			int data1=fh.read();
			System.out.println(data1);
		}
		catch(IOException e) {
			System.out.println("FileNotFound");
		}
			
			
		
			
		
	}

}
