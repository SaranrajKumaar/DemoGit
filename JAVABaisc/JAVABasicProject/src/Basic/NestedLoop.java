package Basic;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * String k ="*"; for (int i=0;i<=4;i++) {
		 * 
		 * for (int j=1; j<=4-i;j++) {
		 * 
		 * System.out.print(k);
		 * 
		 * 
		 * } System.out.println(" "); }
		 **/

		/**
		 * int k=1; for (int i=4; i >=1; i--) {
		 * 
		 * for (int j =5; j>=1+i; j--) {
		 * 
		 * System.out.print(k); k++; } System.out.println("");
		 * 
		 * }
		 **/

		int k = 1;
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
				System.out.print("\t");
				k++;
			}
			System.out.println("");
		}

	}

}
