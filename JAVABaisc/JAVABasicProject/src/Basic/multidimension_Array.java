package Basic;

public class multidimension_Array {
	
	public static void main(String[] args) {
	/**	int a[][]= {{2,4,89},{5,3,6},{2,95,5}};
		
		
		for (int i=0; i<2;i++) {
			
			for (int j=0;j<2;j++) {
				
				System.out.print(a[i][j]);
			}
			System.out.println("");
			
		}
	}**/
		
int a[][]= {{2,4,89},{8,3,6},{2,95,5}};

int min=a[0][0];
int mincolumn =0;
		
		
		for (int i=0; i<3;i++) {
			
			for (int j=0;j<3;j++) {
				
				if (a[i][j]<min)
				{
					min=a[i][j];
					mincolumn=j;
				}
			}
	}int max =a[0][mincolumn];
		
		int k=0;
		while (k<3) {
			if (a[k][mincolumn]>max) {
				
				max=a[k][mincolumn];
				
			}
			k++;
			
		}
		System.out.println(max);
		
	}
	
		
		}


