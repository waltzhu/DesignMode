package classAdapter;

public class germanyTest {
  public static void main(String[] args) {
	//1.������ֻ��ȥ������һ���µĵ¹��ֻ�����Ϊ�ù�ֻ�ܽ��ܵ��ز�ͷ
	  germanyTwoSocketInter gts=new germanyTwoSocket();
	  germanyHotel gh=new germanyHotel(gts);
	  gh.toCustomerCharge();
	  
	  System.out.println("------------------------------------------------------------------------");
	//2.��ӹ����Դ���һ������ת��ͷ�������ͽ���˵��ػ������⡣ 
	  germanyTwoSocketInter gtsNew=new socketAdapter();
	  germanyHotel ghNew=new germanyHotel(gtsNew);
	  ghNew.toCustomerCharge();
}
}
