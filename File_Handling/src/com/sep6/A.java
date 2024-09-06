package com.sep6;

import java.io.FileInputStream;
import java.io.IOException;

public class A {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\ADMIN\\OneDrive\\Desktop\\File_Handling\\db.txt";
		
			FileInputStream fh=new FileInputStream(path);
			int data=fh.read();
			System.out.println(data);
		
			
		
	}

}
