package memento;

public class test {
  public static void main(String[] args) {
	 
	  originator og=new originator("walt","M", "1380000000", "pudong", "walt@126.com");
	  System.out.println("ԭʼ����Ϊ��");
	  System.out.println(og.getName()+"-"+og.getSex()+"-"+og.getPhone()+"-"+og.getAddress()+"-"+og.getEmail());
	  
	  //���б��ݲ���
	  careTaker ct=new careTaker();
	  ct.setMem( og.copyOrigin());
	  
	  //�������
	  og.setAddress("pudong chuansha"); 
	  og.setPhone("171000000");
	  System.out.println("���������Ϊ��");
	  System.out.println(og.getName()+"-"+og.getSex()+"-"+og.getPhone()+"-"+og.getAddress()+"-"+og.getEmail());
	  
	  //��ԭ����
	  og.recoverOrigin(ct.getMem());
	  System.out.println("�ָ�������Ϊ��");
	  System.out.println(og.getName()+"-"+og.getSex()+"-"+og.getPhone()+"-"+og.getAddress()+"-"+og.getEmail());
	  
	  
  }
}
