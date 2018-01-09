package chain;

public class test {
  public static void main(String[] args) {
	
	  actionHandler ah1=new handler1();
	  actionHandler ah2=new handler2();
	  actionHandler ah3=new handler3();
	  
	  ah1.setNextah(ah2);
	  ah2.setNextah(ah3);
	  
	  actionRequest ar1=new request1("«Î«Û1");
	  actionRequest ar2=new request2("«Î«Û2");
	  actionRequest ar3=new request3("«Î«Û3");
	  
	  ah1.actionHand(ar1);
	  System.out.println("*****************************");
	  ah1.actionHand(ar2);
	  System.out.println("*****************************");
	  ah1.actionHand(ar3);
}
}
