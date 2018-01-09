package classAdapter;

public class germanyTest {
  public static void main(String[] args) {
	//1.常规你只能去当地买一个新的德国手机，因为旅馆只能接受当地插头
	  germanyTwoSocketInter gts=new germanyTwoSocket();
	  germanyHotel gh=new germanyHotel(gts);
	  gh.toCustomerCharge();
	  
	  System.out.println("------------------------------------------------------------------------");
	//2.你从国内自带了一个万能转换头，这样就解决了当地化的问题。 
	  germanyTwoSocketInter gtsNew=new socketAdapter();
	  germanyHotel ghNew=new germanyHotel(gtsNew);
	  ghNew.toCustomerCharge();
}
}
