package visitor;

public abstract class medicine {

	 private String name;
	 private String price;
	 public medicine(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	 
	public abstract void accept(visitor vis);
	 
}
