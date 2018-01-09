package build;

public class productBuild implements build {

	Product product;
	
	public productBuild(){
		this.product=new Product();
	}
	
	@Override
	public void makeA() {
		// TODO Auto-generated method stub
		product.setA("A is done");
	}

	@Override
	public void makeB() {
		// TODO Auto-generated method stub
		product.setB("B is done");
	}

	@Override
	public void makeC() {
		// TODO Auto-generated method stub
		product.setC("C is done");
	}

	@Override
	public Product getProduct() {
		// TODO Auto-generated method stub
		return this.product;
	}

}
