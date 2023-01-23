package org.sample;

public class A extends B {
	public A() {
	    super(12);
	    System.out.println("Default const...");
	  }

	  public static void main(String[] args) {
	    A a = new A();
	  }
}
 class B {
		  public B() {
		    System.out.println("Super class");
		  }

		  public B(int id) {
		    System.out.println(id);
		  }

		}


