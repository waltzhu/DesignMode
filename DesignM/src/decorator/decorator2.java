package decorator;

public class decorator2 implements sourceAble{

	 public sourceAble sr;
	  public decorator2(sourceAble source) {
		 this.sr=source;
	}
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
		System.out.println("װ��2ִ��ǰ");
		this.sr.operation();
		System.out.println("װ��2ִ�к�");
	}

}
