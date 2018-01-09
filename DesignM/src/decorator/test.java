package decorator;

public class test {
  public static void main(String[] args) {
	  sourceAble sa=new source();
	  sourceAble sap=new decorator1(new decorator2(sa));
	  sap.operation();
}
}