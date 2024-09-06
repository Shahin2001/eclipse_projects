package com.sep6;

import java.io.FileInputStream;
import java.io.IOException;

public class C {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\ADMIN\\OneDrive\\Desktop\\File_Handling\\db.txt";
		FileInputStream fh=null;
		
		try {
			fh=new FileInputStream(path);
			
			int i;
			while((i=fh.read())!=-1) {
				//System.out.println(i);
				System.out.print((char)i);
			}
			
		}
		catch(IOException e) {
			System.out.println("FileNotFound");
		}
		finally {
			if(fh!=null) {
				fh.close();
			}
		}
			
			
		
			
		
	}

}
