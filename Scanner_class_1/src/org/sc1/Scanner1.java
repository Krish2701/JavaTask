package org.sc1;

import java.util.Scanner;

public class Scanner1 {

@SuppressWarnings({ "resource" })
public static void main(String[] args) {
	int empid;
	String empName;
	Long empPhoneno;
	@SuppressWarnings("unused")
	int empSalary;
//	String empGender;
//	String empCity;
	Scanner sc = new Scanner(System.in);
	empid= sc.nextInt();
	empName=sc.next();
	empPhoneno=sc.nextLong();
	empSalary=sc.nextInt();
//	empGender=sc.nextLine();
//	empCity=sc.nextLine();
	System.out.println("The id of the employee is:" + empid);
	System.out.println("The Name of the employee is:" + empName);
	System.out.println("The phoneno of the employee is:" + empPhoneno);
	System.out.println("The Salary  of the employee is:" + empSalary);
//	System.out.println("The Gender of the employee is:" + empGender);
//	System.out.println("The City of the employee is:" + empCity);
//	
}
}
