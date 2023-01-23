package org.emp;

public class Employee {
	int employee_id;
	String employee_name;
	int employee_dob;
	long employee_phone;
	String employee_Email;
	String employee_address;
	
//	Employee(int id,String name,int dob,long phone,String Email,String address){
//		employee_id=id;
//		employee_name=name;
//		employee_dob=dob;
//		employee_phone=phone;
//		employee_Email=Email;
//		employee_address=address;
//	}
	
	void empId(int id ) {
		employee_id=id;
		
		
	}
	void empName(String name) {
		employee_name=name;
		
	}
	void empDob(int dob) {
		employee_dob=dob;
		
	}
	
	void empPhone(long phone) {
		employee_phone=phone;
		
	}
	void empEmail(String Email){
		employee_Email=Email;
		
	}
	void empAddress(String address){
		employee_address=address;
		
		
	}
	void display() {
		System.out.println(employee_id);
		System.out.println(employee_name);
		System.out.println(employee_dob);
		System.out.println(employee_phone);
		System.out.println(employee_Email);
		System.out.println(employee_address);
		
	}
public static void main(String args[]) {
	@SuppressWarnings("unused")
//	Employee emp1= new Employee();
//	emp1.employee_id = 20;
//	emp1.employee_name="Krish";
//	emp1.employee_dob=27-01-2001;
//	emp1.employee_phone=9677354419L;
//	emp1.employee_Email="gobikrish4567@gmail.com";
//	emp1.employee_address="Coimbatore";
//	emp1.empId();
//	Employee emp1= new Employee(20,"Krish",27-01-2001,9677354419L,"gobikrish4567@gmail.com","Coimbatore");
//	emp1.empId();
	
	Employee emp1=new Employee();
	emp1.empId(20);
	emp1.empName("Krish");
	emp1.empDob(27-01-2001);
	emp1.empPhone(9677354419L);
	emp1.empEmail("gobikrish4567@gmail.com");
	emp1.empAddress("Coimbatore");
	emp1.display();
}
}
