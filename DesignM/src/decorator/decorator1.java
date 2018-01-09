package decorator;

public class decorator1 implements sourceAble{

	 public sourceAble sr;
	  public decorator1(sourceAble source) {
		 this.sr=source;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("装饰1执行前");
		this.sr.operation();
		System.out.println("装饰1执行后");
	}

}
