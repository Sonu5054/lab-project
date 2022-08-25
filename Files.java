package com.son;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Files {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner so=new Scanner(System.in);
	File f1=new File("c:Sonu.txt");	
	System.out.println("Enter the data into the file");
	String data=so.nextLine();
	FileWriter fw=new FileWriter(f1);
	fw.write(data);
	System.out.println("Entry done");
	
	}

}
