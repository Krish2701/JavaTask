package org.langs;

import java.util.Scanner;

class LanguageInfo{
	int percent_count;
	String Greeting;
	
	LanguageInfo(int count,String Greet){
		percent_count=count;
		Greeting=Greet;
		
		
	}
	void tamilLanguage() {
		System.out.println(percent_count);
		System.out.println(Greeting);

		
	}
	void englishLanguage() {
		System.out.println(percent_count);
		System.out.println(Greeting);

		
	}
	void hindiLanguage() {
		System.out.println(percent_count);
		System.out.println(Greeting);
	
		
	}
//	void printLanguage() {
//		System.out.println("The English Language information");
//		englishLanguage();
//		System.out.println("The hindi Language information");
//		hindiLanguage();
//	}
}
class State_Details{
	String Region;
	void southIndia() {
		System.out.println("SOUTH");
		
	}
	void northIndia() {
		System.out.println("NORTH");
		
	}
}

public class StateDetails {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LanguageInfo loft1 = new LanguageInfo(40,"Vanakkam");
		LanguageInfo lofe1 = new LanguageInfo(30,"Hello");
		LanguageInfo lofh1 = new LanguageInfo(30,"namaste");
		LanguageInfo lofm1 = new LanguageInfo(10,"Vanakkam");
		LanguageInfo lofe2 = new LanguageInfo(30,"Hello");
		LanguageInfo lofh2 = new LanguageInfo(60,"namaste");
		LanguageInfo lofte1 = new LanguageInfo(20,"Vanakkam");
		LanguageInfo lofe3 = new LanguageInfo(30,"Hello");
		LanguageInfo lofh3 = new LanguageInfo(50,"namaste");
		LanguageInfo lofk1 = new LanguageInfo(30,"Vanakkam");
		LanguageInfo lofe4 = new LanguageInfo(30,"Hello");
		LanguageInfo lofh4 = new LanguageInfo(40,"namaste");
		LanguageInfo lofta1 = new LanguageInfo(5,"Vanakkam");
		LanguageInfo lofe5= new LanguageInfo(15,"Hello");
		LanguageInfo lofh5 = new LanguageInfo(80,"namaste");
		
		
		
		
		State_Details stds1 = new State_Details();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the state name:");
		stds1.Region= sc.next();
		sc.close();
		switch(stds1.Region) {
		case "TN":
			stds1.southIndia();
			loft1.tamilLanguage();
			lofe1.englishLanguage();
			lofh1.hindiLanguage();
			break;
		
		case "AP":
			stds1.southIndia();
			lofte1.tamilLanguage();
			lofe2.englishLanguage();
			lofh2.hindiLanguage();
			break;
		
		case "MA":
			stds1.southIndia();
			lofm1.tamilLanguage();
			lofe3.englishLanguage();
			lofh3.hindiLanguage();
			break;
		
		case "KA":
			stds1.southIndia();
			lofk1.tamilLanguage();
			lofe4.englishLanguage();
			lofh4.hindiLanguage();
			break;
		
		case "Northh":
			stds1.northIndia();
			lofta1.tamilLanguage();
			lofe5.englishLanguage();
			lofh5.hindiLanguage();
			break;
			
		}
		
		
		

	}

}
