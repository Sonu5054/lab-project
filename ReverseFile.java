package com.son;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ReverseFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f1=new File("c:Sonu.txt");
		Scanner so=new Scanner(f1);
		
		while(so.hasNextLine()) {
			System.out.println(so.nextLine());
		}
	}

}