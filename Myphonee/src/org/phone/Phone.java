package org.phone;

public class Phone {
	void phoneInfo(int phone_id , String phone_name) {
		System.out.println("The id of the phone is " + phone_id);
		System.out.println("The Name of the phone is " + phone_name);
	}
	void phoneInfo(String phone_name,int phone_id) {
		System.out.println("The id of the phone is " + phone_id);
		System.out.println("The Name of the phone is " + phone_name);
	}
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo(21, "Realme");
		ph.phoneInfo("Redmi", 34);
	}

}
