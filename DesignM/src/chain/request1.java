package chain;

public class request1 extends actionRequest {
  
	//子类实例化时，会首先调用父类的构造函数-如果父类没有无参，子类不能定义无参
	public request1(){}
	
	public request1(String content){
		super(content);
	}
	
	@Override
	public int getRequestLevel() {
		return levels.level_01;
	}

}
