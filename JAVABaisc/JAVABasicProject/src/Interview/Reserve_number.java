package Interview;

import java.util.Scanner;

public class Reserve_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int givenNumber=0;
		
		int reversedNumber=0;
		
		System.out.println("Enter your number");
		
		Scanner sc = new Scanner(System.in);
		givenNumber=sc.nextInt();
		
		while(givenNumber !=0) {
			
			reversedNumber=reversedNumber*10;
			reversedNumber=reversedNumber+givenNumber%10;
			givenNumber=givenNumber/10;
			
			
		}
		System.out.println(reversedNumber);

	}

}
