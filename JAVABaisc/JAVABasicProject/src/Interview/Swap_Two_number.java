package Interview;

public class Swap_Two_number {
	
	
	public void threeVariable() {
		int junior =20;
		int senior =50;
		
		System.out.println();
		
		int temp =junior;
		junior=senior;
		senior=temp;
		
		System.out.println(senior);

	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int juniormem =20,seniormem =50;
		
		juniormem =juniormem-seniormem;
		seniormem=juniormem+seniormem;
		juniormem=seniormem-juniormem;
		System.out.println(juniormem);
		
		

	}

}
