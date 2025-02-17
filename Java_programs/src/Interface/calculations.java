package Interface;

public  class calculations implements calculation1,calculation2 {
	@Override
	public void x() {
		System.out.println("x method");
		
	}

	@Override
	public void parametor() {
		System.out.println("length : "+(length*length));
		System.out.println("side : "+(side*side));
		
	}

	@Override
	public void area() {
		System.out.println(2*length*breath);
	System.out.println(4*length);
		
	}
	public static void main(String[] args) {
		calculations obj = new calculations();
	
		obj.area();
		obj.parametor();
		obj.x();
	}
}
