package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private String empname;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	} 
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Employee emp1 = new Employee();
		Company comp= new Company();
		Client cli = new Client();
		Project pr = new Project();
		comp.setCompanyName("Tekizma");
		emp1.setEmpname("Krish");
		cli.setClientName("GTS");
		pr.setProjectName("Medico");
		System.out.println("Name: "+ comp.getCompanyName()+"\n" + "EmpName: "+ emp1.getEmpname()+"\n"+"ClientName:" + cli.getClientName()+"\n"+"projectName:" + pr.getProjectName());
	}

}

