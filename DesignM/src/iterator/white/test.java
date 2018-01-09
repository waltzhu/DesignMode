package iterator.white;

public class test {
  public static void main(String[] args) {
	 
	  Object[] objArray=new Object[]{"aa","bb","cc","dd"};
	  
	  myAggregate mag=new myAggregate(objArray);//将我们最原始的结合，提交给集合类进一步封装
	  
	  iterator ia=mag.createIterator();//封装后的集合类，进一步输出到子类迭代器统一处理
	  while(!ia.isTail()){
		  System.out.println(ia.getCurrentItem());
		  ia.next();
	  }
}
}
