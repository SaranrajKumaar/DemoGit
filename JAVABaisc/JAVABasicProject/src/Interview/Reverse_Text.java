package Interview;

public class Reverse_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "I love Vinifer";
		
		String reversed ="";
		
		String[] name =text.split(" ");
		
		System.out.println(name[1]);
		for (int i=name.length-1; i>=0; i--) {
			
			reversed = reversed+name[i];		
		}
		System.out.println(reversed);		
	}
}
