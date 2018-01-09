package protoType;

public class user implements Cloneable{
   public String id="";
   public String getId() {
	return id;
   }
	public void setId(String id) {
		this.id = id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return (user)super.clone();
	}
}
