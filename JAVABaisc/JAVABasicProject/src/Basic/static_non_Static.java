package Basic;

public class static_non_Static {
	
	
	String  name ;
	String city;
	static String Address;
	
	static_non_Static(String name, String Address,String city) {
		
		this.city=city;
		this.Address=Address;
		this.name=name;
		
		
	}
	
	public static void getcity() {
		
		System.out.println(Address);
		
		
	}

	public static void main(String[] args) {
		static_non_Static ss = new static_non_Static("Sathish", "Erode", "Tamilnadu");
		
		static_non_Static.getcity();
		// TODO Auto-generated method stub

	}

}
