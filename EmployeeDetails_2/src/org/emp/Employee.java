package org.emp;

public class Employee {
	void empId(int emp_id) {
		System.out.println("The id of the employee is :" + emp_id);
	}
	void empId(double emp_id) {
		System.out.println("The id of the employee is :" + emp_id);
	}
public static void main(String[] args) {
	Employee emp= new Employee();
	emp.empId(10);
	emp.empId(1.144d);
	
}
}
