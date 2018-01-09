package command;

public class navyCommand implements command {
	public navyReveiver nr;
	public navyCommand(){
		this.nr=new navyReveiver();
	}
	@Override
	public void eat() {
		this.nr.eat();
	}
	@Override
	public void fight() {
		this.nr.fight();
	}
}
