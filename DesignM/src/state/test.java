package state;

public class test {
  public static void main(String[] args) {
	 /*
	  * 分析：
	  * 1.状态的切换，是通过父类中引用的开关context来统一处理
	  * 2.开关context包含了所有的状态信息
	  * 3.所以开关context和状态类之间是耦合的
	  * 
	  * 缺点：相互耦合，开发无法独立
	  */
	  context ct=new context();
	  ct.setLiftState(new openState());
	  //测试do nothing情况
	  ct.run();
	  System.out.println("*********************");
	  //正常流程
	  ct.close();
	  ct.run();
	  ct.stop();
	  ct.open();
	  
}
}
