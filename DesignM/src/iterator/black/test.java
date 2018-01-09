package iterator.black;

public class test {
  public static void main(String[] args) {
	 
	  Object[] objArray=new Object[]{"aa","bb","cc","dd"};
	  
	  myAggregate mag=new myAggregate(objArray);
	  
	  iterator ia=mag.createIterator();
	  while(!ia.isTail()){
		  System.out.println(ia.getCurrentItem());
		  ia.next();
	  }
}
}
