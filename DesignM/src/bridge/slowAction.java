package bridge;

public class slowAction implements action{
	@Override
	public void run() {
		 System.out.println("������");
	}
	@Override
	public void fight() {
		System.out.println("������");
	}
	@Override
	public void recovery() {
		System.out.println("�����ظ�");
	}
}
