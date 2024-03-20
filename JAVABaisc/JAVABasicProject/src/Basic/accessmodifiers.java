package Basic;

public class accessmodifiers {

	int a = 7;
	int b = 0;

	public void getdata() {
		try {
			int c = a / b;

			System.out.println(c);
		} catch (Exception arithException) {
			System.out.println(" it will run");
			// TODO: handle exception
		}
		finally {
			System.out.println(" script is not filled");
		}
	}

	public static void main(String[] args) {

		accessmodifiers am = new accessmodifiers();
		am.getdata();
	}

}
