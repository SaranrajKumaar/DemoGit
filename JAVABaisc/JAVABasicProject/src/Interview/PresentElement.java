package Interview;

import java.util.Scanner;

public class PresentElement {
	
	public static void arrayList() {
		
		int arr[] = {2,5,48,5};
		
		int input;
		
		boolean num =false;
		
		Scanner sc =new Scanner(System.in);
		input=sc.nextInt();
		
		for(int i=0;i<arr.length;i++) {
			
			if (input == arr[i]) {
				num=true;
				break;
				
			}
			}
		if(num) {
			System.out.println("present");
		}else {
			System.out.println("Absent");
		}
	}

	public static void main(String[] args) {
		
		arrayList();
		
		
		
		
		
		
		
	}
}
