package com.ankit.maven.Startit;

import java.io.*;
import java.util.Scanner;

public class Test1 {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
	    System.out.println("Enter the String & Number :");
	    String name = in.nextLine();
	    int numbers = in.nextInt();
	    System.out.println("Name :"+ name + "Number :" +numbers);
	}

}
