package Interview;

public class Occurrence_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String given= "I love my vinifer";
		
		char toMy='i';
		
		int occurrence =0;
		
		given=given.toLowerCase();
		
		for(int i=0; i<given.length();i++) {
			
			if(given.charAt(i)==toMy) {
				occurrence=occurrence+1;
				
			}
		}
		System.out.println(occurrence);
		
		
		

	}

}
