package bridge;

public class quickAction implements action {
	@Override
	public void run() {
		 System.out.println("������");
	}
	@Override
	public void fight() {
		 System.out.println("���ٸ�");
	}
	@Override
	public void recovery() {
		 System.out.println("���ٻظ�");
	}
}
