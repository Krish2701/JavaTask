package org.odds;

public class Add_odd {
	static int n=0;

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				n=n+i;
				
			}
			
		}
		System.out.println(n);
	}

}
