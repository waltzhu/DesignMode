package command;

public class navyGeneral implements general{
   public command ca;
   public navyGeneral(navyCommand navyCommand){//这里有个技巧：限制类型，防止越权
	   this.ca=navyCommand;
   }
	@Override
	public void eat() {
		this.ca.eat();
	}
	@Override
	public void fight() {
		this.ca.fight();
	}
	@Override
	public void meeting() {
		 System.out.println("this is navy general self meeting......");
	}
}
