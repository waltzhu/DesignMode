package command;

public class armyCommand implements command {
	public armyReceiver  ar;
	//public armyCommand(armyReceiver armyReceiver){ 这种写法是错的，因为命令到执行者需要自动完成，不能靠外界，否则就达不到解耦目的。
	public armyCommand(){
		this.ar=new armyReceiver();
	}
	@Override
	public void eat() {
		this.ar.eat();
	}
	@Override
	public void fight() {
		this.ar.fight();
	}
}
