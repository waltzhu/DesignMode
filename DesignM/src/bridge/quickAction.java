package bridge;

public class quickAction implements action {
	@Override
	public void run() {
		 System.out.println("快速跑");
	}
	@Override
	public void fight() {
		 System.out.println("快速格斗");
	}
	@Override
	public void recovery() {
		 System.out.println("快速回复");
	}
}
