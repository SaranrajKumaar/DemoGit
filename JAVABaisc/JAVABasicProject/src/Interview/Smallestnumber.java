package Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Smallestnumber {
	int	givenarray[] = {2,5,78,5,0,5};
	public void own_Method() {
		
		
		
		int smallest =Integer.MAX_VALUE;
		
		for(int i=0; i<givenarray.length;i++) {
			
			if (givenarray[i]<smallest) {
				
				smallest=givenarray[i];
				
				
				
				
			}
		}
		System.out.println(smallest);
		
		
	}
	
	public void usingArrays() {
		
		Arrays.sort(givenarray);
		System.out.println(givenarray[0]);
		
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smallestnumber sn = new Smallestnumber();
		
		sn.usingArrays();
		
		
		
	

	}

}
