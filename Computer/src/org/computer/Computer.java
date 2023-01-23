package org.computer;

public class Computer {
	
	public void computerModel(int comp_id , String comp_model) {
		System.out.println("The id of the computer is " + comp_id);
		System.out.println("The Model of the computer is " + comp_model);
		
	}
	public static void main(String[] args) {
		Desktop desk = new Desktop();
		desk.computerModel(211, "HP");
		desk.desktopSize("15.6 inch");
	}
}
class Desktop extends Computer{
	public void desktopSize(String size) {
		System.out.println("The size of the desktop is : " + size);
	}
}