package decorator;

public class decorator2 implements sourceAble{

	 public sourceAble sr;
	  public decorator2(sourceAble source) {
		 this.sr=source;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("装饰2执行前");
		this.sr.operation();
		System.out.println("装饰2执行后");
	}

}
