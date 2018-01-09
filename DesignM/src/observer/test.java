package observer;

public class test {
	 public static void main(String[] args) {
		observer policyObserver=new policyObserver();
		observer securityObserver=new securityObserver();
		observer thiefObserver=new thiefObserver();
		
		goods goldGoods=new gold("完好无损");//多态：不能调用子类独有的方法
		 goldGoods.addObserver(thiefObserver);
		 goldGoods.addObserver(securityObserver);
		 goldGoods.addObserver(policyObserver);
		 
		 goldGoods.setState("自燃毁损");
		 
		 
	 }
}
