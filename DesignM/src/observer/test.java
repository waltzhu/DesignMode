package observer;

public class test {
	 public static void main(String[] args) {
		observer policyObserver=new policyObserver();
		observer securityObserver=new securityObserver();
		observer thiefObserver=new thiefObserver();
		
		goods goldGoods=new gold("�������");//��̬�����ܵ���������еķ���
		 goldGoods.addObserver(thiefObserver);
		 goldGoods.addObserver(securityObserver);
		 goldGoods.addObserver(policyObserver);
		 
		 goldGoods.setState("��ȼ����");
		 
		 
	 }
}
