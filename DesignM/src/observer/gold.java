package observer;

public class gold extends goods {
	  
	  public gold(String state){
		  this.state=state;
		  System.out.println("我是金子货物商队，准备出发，目前货物状态："+state);
	  }
	  //当你定义了有参的构造方法时，就不会给你自己加一个了，所以这时候需要自己写一个无参的。
	  public gold(){
		  
	  }
	public void setState(String state) {
		this.state = state;
		System.out.println("我是金子货物商队，半路中，目前货物状态："+state);
		super.notifyObserver(state);
	}
}
