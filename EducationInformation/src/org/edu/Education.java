package org.edu;

public class Education {
	public void ug(String name_of_courses, int no_of_students) {
		System.out.println("the name_of_courses " + name_of_courses);
		System.out.println("the no_of_students " + no_of_students);
		
	}
	public void pg(String name_of_courses, int no_of_students) {
		System.out.println("the name_of_courses " + name_of_courses);
		System.out.println("the no_of_students " + no_of_students);
		
	}

}
class Arts extends Education{
	public void bSc(int no_of_stds) {
		System.out.println("The no_of_students in bsc is " + no_of_stds);
	}
	public void bEd(int no_of_stds) {
		System.out.println("The no_of_students in bEd is " + no_of_stds);
	}
	public void bA(int no_of_stds) {
		System.out.println("The no_of_students in bA is " + no_of_stds);
	}
	public void bBA(int no_of_stds) {
		System.out.println("The no_of_students in bBA is " + no_of_stds);
	}
	public void ug(String name_of_course, int no_of_students) {
		super.ug("bsc",35);
		System.out.println("the names_of_course " + name_of_course);
		System.out.println("the final_count of the student is " + (no_of_students-10));
		
	}
	public void pg(int no_of_discontinues, int final_count) {
		System.out.println("the no_of_discontinues " + no_of_discontinues);
		System.out.println("the final_count of the student is " + final_count);
		
	}
	public static void main(String[] args) {
		Arts ar = new Arts();
		ar.ug("bsc", 35);
	}
}
