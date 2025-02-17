package Inheritace2;

public class apple extends Mobile{
    public void camera() {
    	System.out.println("camera is 30px");
    }
    public void photoClarity() {
    	System.out.println("photo clarity is 4k");
    }
    public static void main(String[] args) {
		apple a = new apple();
		a.setMobileNumber("8499041658");
		a.call();
		a.message();
		a.camera();
		a.photoClarity();
	}
}
