package chain;

public class handler3 extends actionHandler {

	@Override
	public int getActionHandlerLevel() {
		return levels.level_03;
	}

	@Override
	public void handActionRequest(actionRequest ar) {
		System.out.println("������3��������"+ar.getContent());
	}

}
