package objectAdapter;

public class germanyTest {
  public static void main(String[] args) {
	//1.������ֻ��ȥ������һ���µĵ¹��ֻ�����Ϊ�ù�ֻ�ܽ��ܵ��ز�ͷ
	  germanyTwoSocketInter gts=new germanyTwoSocket();
	  germanyHotel gh=new germanyHotel(gts);
	  gh.toCustomerCharge();
	  System.out.println("------------------------------------------------------------------------");
	//2.��ӹ����Դ���һ������ת��ͷ�������ͽ���˵��ػ������⡣
	  chinaThreeSocketInter ctsi=new chinaThreeSocket();
	  germanyTwoSocketInter gtsNew=new socketAdapter(ctsi);
	  germanyHotel ghNew=new germanyHotel(gtsNew);
	  ghNew.toCustomerCharge();
}
}
