package command;

public class test {
  public static void main(String[] args) {
	  general navGe=new navyGeneral(new navyCommand());
	  navGe.eat();
	  navGe.fight();
	  navGe.meeting();
	  System.out.println("*************************************************");
	  general armGe=new armyGeneral(new armyCommand());
	  armGe.eat();
	  armGe.fight();
	  armGe.meeting();
}
}
