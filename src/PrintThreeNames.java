package com.bootcamp.day1;
import java.util.Scanner;

public class PrintThreeNames{

	    public static void main(String[] args) {
	    	String name;
	    	Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name : ");
			 name = sc.next();
			
	        System.out.print("Hi, " +name+ " " );
	        System.out.println(". How are you?");
	    }
	}