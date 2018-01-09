package bridge;

public class magicProfessional extends professional{
	public void run() {
		 super.run();
		 System.out.println("法师开始跑");
	}
	public void fight() {
		super.fight();
		 System.out.println("法师开始战斗");
	}

	public void recovery() {
		super.recovery();
		 System.out.println("法师开始回复");
	}
}
