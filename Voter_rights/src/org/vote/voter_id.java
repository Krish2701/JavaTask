package org.vote;

import java.util.Scanner;

public class voter_id {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int Age;
		Scanner sc = new Scanner(System.in);
		Age=sc.nextInt();
		if((Age)>=18) {
			System.out.println("The candidate is eligible to vote");
			
		}
		else {
			System.out.println("The candidate is not eligible to vote");
		}
	}

}
