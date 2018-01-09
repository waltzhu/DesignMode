package bridge;

public class soliderProfessional extends professional{
	public void run() {
		super.run();
		 System.out.println("战士开始跑");
	}
	public void fight() {
		super.fight();
		 System.out.println("战士开始战斗");
	}
	public void recovery() {
		super.recovery();
		 System.out.println("战士开始回复");
	}
}
