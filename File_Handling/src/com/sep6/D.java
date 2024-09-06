package com.sep6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class D {
	public static void main(String[] args) throws IOException {
		String path="C:\\Users\\ADMIN\\OneDrive\\Desktop\\File_Handling\\db.txt";
		String path1="C:\\Users\\ADMIN\\OneDrive\\Desktop\\File_Handling\\demo.txt";
		FileInputStream fh=null;
		FileOutputStream fh1=null;
		
		try {
			fh=new FileInputStream(path);
			fh1=new FileOutputStream(path1);
			
			int i;
			while((i=fh.read())!=-1) {
				
				System.out.print((char)i);
				
				//fh1.write(i);			
				}
			String name = "Girl Shaina";
            fh1.write(name.getBytes());

            //System.out.println("\nFile written successfully with 'Shaina' added.");
			
		}
		catch(IOException e) {
			System.out.println("FileNotFound");
		}
		finally {
			if(fh!=null) {
				fh.close();
			}
			if(fh1!=null) {
				fh1.close();
			}
		}
			
			
		
			
		
	}

}
