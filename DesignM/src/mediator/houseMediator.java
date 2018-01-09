package mediator;

public class houseMediator implements mediator {
	public user zhangsan;
	public user lisi;
	public  houseMediator() {
		 this.zhangsan=new zhangsan();
		 this.lisi=new lisi();
	}
	@Override
	public void sale() {
		 System.out.println("this is house mediator sale house to:......");
		 this.zhangsan.buy();
		 this.lisi.buy();
	}
}
