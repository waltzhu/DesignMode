package protoType;

public class test {
  public static void main(String[] args) throws Exception {
	
	  proto pt=new proto();
	  
	  proto ptc=(proto) pt.clone();
	  
	  System.out.println(pt.hashCode()+"**********************"+ptc.hashCode());
	  System.out.println(pt.getUe().hashCode()+"**********************"+ptc.getUe().hashCode());
}
}
