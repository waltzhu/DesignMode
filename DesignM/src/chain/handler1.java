package chain;

public class handler1 extends actionHandler {

	@Override
	public int getActionHandlerLevel() {
		return levels.level_01;
	}

	@Override
	public void handActionRequest(actionRequest ar) {
		System.out.println("������1��������"+ar.getContent());
	}

}
