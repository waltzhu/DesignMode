package command;

public class armyCommand implements command {
	public armyReceiver  ar;
	//public armyCommand(armyReceiver armyReceiver){ ����д���Ǵ�ģ���Ϊ���ִ������Ҫ�Զ���ɣ����ܿ���磬����ʹﲻ������Ŀ�ġ�
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
