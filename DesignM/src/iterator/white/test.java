package iterator.white;

public class test {
  public static void main(String[] args) {
	 
	  Object[] objArray=new Object[]{"aa","bb","cc","dd"};
	  
	  myAggregate mag=new myAggregate(objArray);//��������ԭʼ�Ľ�ϣ��ύ���������һ����װ
	  
	  iterator ia=mag.createIterator();//��װ��ļ����࣬��һ����������������ͳһ����
	  while(!ia.isTail()){
		  System.out.println(ia.getCurrentItem());
		  ia.next();
	  }
}
}
