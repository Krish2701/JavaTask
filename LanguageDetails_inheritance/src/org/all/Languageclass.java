package org.all;


public class Languageclass {
	void alllanguage(int nos) {
		System.out.println("The count of the Language Speakers:" + nos);
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Telugu Tel= new Telugu();
		Tel.alllanguage(100);
		Tel.tamillanguage(20);
		Tel.Englishlanguage(40);
		Tel.Telugulanguage(40);
		
		
	}
}
class Tamil extends Languageclass {

	public void tamillanguage(int not){
		System.out.println("The count of the Tamil Language Speakers:" + not);
	}

}
class English extends Tamil {
	public void Englishlanguage(int noe){
		System.out.println("The count of the English Language Speakers:" + noe);
	}
}

class Telugu extends English {
	public void Telugulanguage(int note){
		System.out.println("The count of the Telugu Language Speakers:" + note);
	}
}
