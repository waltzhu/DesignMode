package visitor;

public class medicineB extends medicine {

	public medicineB(String name,String price){
		super(name,price);
	}
	
	
	@Override
	public void accept(visitor vis) {
		 vis.visit(this);
	}

}
