package chain;

public class handler2 extends actionHandler {

	@Override
	public int getActionHandlerLevel() {
		return levels.level_02;
	}

	@Override
	public void handActionRequest(actionRequest ar) {
		System.out.println("������2��������"+ar.getContent());
	}

}
