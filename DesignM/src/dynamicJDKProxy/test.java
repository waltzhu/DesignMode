package dynamicJDKProxy;


public class test {
  public static void main(String[] args) {
	    soureAble  sa=new source();
	 
	    proxySource ih=new  proxySource(sa);
		soureAble sap=(soureAble) ih.getProxy();
		
	    sap.operation();
}
}
