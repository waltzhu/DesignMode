package command;

public class armyGeneral implements general {
	 public command ca;
     public armyGeneral(armyCommand armyCommand){
	   this.ca=armyCommand;
    }
	@Override
	public void eat() {
		this.ca.eat();
	}
	@Override
	public void meeting() {
		 System.out.println("this is army general self meeting......");
	}
	@Override
	public void fight() {
		this.ca.fight();
	}
}
