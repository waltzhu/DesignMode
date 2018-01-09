package flyWeight;


public class myFlyWeight extends flyWeight {
   public String myStr;
   public myFlyWeight(String str){
	   this.myStr=str;
   }
	@Override
	public void fly() {
		 System.out.println("this is myFlyWeight fly:"+myStr);
	}
}
