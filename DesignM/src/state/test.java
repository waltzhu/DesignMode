package state;

public class test {
  public static void main(String[] args) {
	 /*
	  * ������
	  * 1.״̬���л�����ͨ�����������õĿ���context��ͳһ����
	  * 2.����context���������е�״̬��Ϣ
	  * 3.���Կ���context��״̬��֮������ϵ�
	  * 
	  * ȱ�㣺�໥��ϣ������޷�����
	  */
	  context ct=new context();
	  ct.setLiftState(new openState());
	  //����do nothing���
	  ct.run();
	  System.out.println("*********************");
	  //��������
	  ct.close();
	  ct.run();
	  ct.stop();
	  ct.open();
	  
}
}
