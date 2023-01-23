package org.sc2;

import java.util.Scanner;

public class Scanner2 {

	private static int sum;

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int studentId;
		String studentName;
		int Mark1;
		int Mark2;
		int Mark3;
		int Mark4;
		int Mark5;
		int nos;
		Scanner sc = new Scanner(System.in);
		studentId=sc.nextInt();
		studentName=sc.next();
		Mark1=sc.nextInt();
		Mark2=sc.nextInt();
		Mark3=sc.nextInt();
		Mark4=sc.nextInt();
		Mark5=sc.nextInt();
		nos=sc.nextInt();
		System.out.println("The id of the student is :"+ studentId);
		System.out.println("The Name of the student is :"+ studentName);
		System.out.println("The Mark1 of the student is :"+ Mark1);
		System.out.println("The Mark2 of the student is :"+ Mark2);
		System.out.println("The Mark3 of the student is :"+ Mark3);
		System.out.println("The Mark4 of the student is :"+ Mark4);
		System.out.println("The Mark5 of the student is :"+ Mark5);
		sum=Mark1+Mark2+Mark3+Mark4+Mark5;
		System.out.println("The Sum of the Marks is :"+ sum);
		System.out.println("The Average  of the Marks is :"+ sum/nos);
		

	}

}
