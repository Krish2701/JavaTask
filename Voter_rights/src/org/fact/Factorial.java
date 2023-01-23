package org.fact;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n=1;
		int a;
		Scanner sc=new Scanner(System.in);
		a= sc.nextInt();
		for(int i=1;i<=a;i++) {
			n=i*n;
		}
		System.out.println(n);
	}

}
