package flyWeight;

public class test {
  public static void main(String[] args) {
	  //1.String中享元模式
	  compareString();
	  System.out.println("****************************************************");
	  //2.享元模式
	  flyWeightFactory fwf=new flyWeightFactory();
	  flyWeight fw1=fwf.getFlyWeight("waltzhu1");
	  flyWeight fw2=fwf.getFlyWeight("waltzhu2");
	  flyWeight fw3=fwf.getFlyWeight("waltzhu3");
	  flyWeight fw4=fwf.getFlyWeight("waltzhu1");
	  
	  fw1.fly();
	  fw2.fly();
	  fw3.fly();
	  fw4.fly();
	  
	  int flyWeightSize=fwf.getFlyweightSize();
	  System.out.println("flyWeightSize is :"+flyWeightSize);
}
  
  public static void compareString(){
	  String a="";
	  String b="";
	  if(a==b){
		  System.out.println("OK");
	  }else{
		  System.out.println("no");
	  }
  }
}
