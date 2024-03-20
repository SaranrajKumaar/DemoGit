package Basic;

public class overloading {
	static String a="Mamatha";
	
	public int getdata(int a) {
		return a;
	}


	
	public String getdata(String b,String a ) {
		return (b+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		overloading ol = new overloading();
		System.out.println( ol.getdata(2+2));
		System.out.println(ol.getdata("saran", a));
	}

}
