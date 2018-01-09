package visitor;

public class medicineA extends medicine {

	public medicineA(String name,String price){
		super(name,price);
	}
	
	
	@Override
	public void accept(visitor vis) {
		 vis.visit(this);
	}

}
