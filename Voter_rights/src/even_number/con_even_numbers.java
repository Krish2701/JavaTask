package even_number;

public class con_even_numbers {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
			else {
				continue;
			}
		}

	}

}
