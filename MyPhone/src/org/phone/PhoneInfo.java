package org.phone;


public class PhoneInfo {
	String phoneName;
	Long phoneMieiNum;
	String Camera;
	int storage;
	String osName;
	
	PhoneInfo(String Name,Long Imei,String pixel,int vstorage,String vName){
		phoneName=Name;
		phoneMieiNum=Imei;
		Camera=pixel;
		storage=vstorage;
		osName=vName;
		
		
	}
	void phoneName(){
		System.out.println("The Name of the phone is " + phoneName );
	}
	void phoneMieiNum(){
		System.out.println("The IMEI of the phone is " + phoneMieiNum );
	}
	void Camera(){
		System.out.println("The Camera of the phone is " + Camera );
	}
	void storage(){
		System.out.println("The storage of the phone is " + storage );
	}
	void osName(){
		System.out.println("The OS of the phone is " + osName );
	}
	void display() {
		phoneName();
		phoneMieiNum();
		Camera();
		storage();
		osName();
		
	}
	public static void main(String args[]) {
		PhoneInfo Comp1= new PhoneInfo("Galaxy",101234444L,"64MP",128,"Snapdragon");
		Comp1.display();

}
}
