package org.add;

public class GreensTech {
	void greensOmr(int propertyid , String Propertyname) {
		System.out.println("The id of the property is" + propertyid );
		System.out.println("The name of the property is" + Propertyname );
	}
	void greensOmr( String Propertyname) {
		System.out.println("The name of the property is" + Propertyname );
	}
	void greensOmr(String Propertyname,int propertyid) {
		System.out.println("The id of the property is" + propertyid );
		System.out.println("The name of the property is" + Propertyname );
	}
	void greensOmr(double propertyid , String Propertyname) {
		System.out.println("The id of the property is" + propertyid );
		System.out.println("The name of the property is" + Propertyname );
	}
	public static void main(String[] args) {
		GreensTech gt = new GreensTech();
		gt.greensOmr(1, "OMR");
		gt.greensOmr("cholinganur");
		gt.greensOmr("vilivakam", 5);
		gt.greensOmr(123.3, "vk road");
	}

}
