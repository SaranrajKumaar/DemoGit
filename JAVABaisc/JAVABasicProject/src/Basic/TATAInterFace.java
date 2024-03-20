package Basic;

public class TATAInterFace implements MarutisuzkiInterface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarutisuzkiInterface ms = new TATAInterFace();
		ms.wagon();
		
		TATAInterFace t = new TATAInterFace();
		t.Benzs();

	}

	@Override
	public void wagon() {
		// TODO Auto-generated method stub
		System.out.println("new model");
		
	}
	
	public void Benzs() {
		System.out.println("richest car");
	}

}
