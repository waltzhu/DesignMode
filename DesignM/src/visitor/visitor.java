package visitor;

public abstract class visitor {
   private String name;
   public String getName() {
	return name;
   }	

	public void setName(String name) {
		this.name = name;
	}

public abstract void visit(medicineA ma);
public abstract void visit(medicineB mb);
 
}
