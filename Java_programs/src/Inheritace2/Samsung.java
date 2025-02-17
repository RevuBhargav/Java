package Inheritace2;

public class Samsung extends Mobile {
    public int model;

	public int getModel() {
		return model;
	}

	public void setModel(String MobileNumber,int model) {
		
		this.model = model;
	}
	public void camera() {
		System.out.println("camera is 10px");
	}
	public void model(String s) {
		System.out.println("Model is "+s);
	}
	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.setMobileNumber("8499041658");
		s.call();
		s.message();
		s.camera();
		s.model("vivo");
		
	}

	
}
