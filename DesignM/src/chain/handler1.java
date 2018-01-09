package chain;

public class handler1 extends actionHandler {

	@Override
	public int getActionHandlerLevel() {
		return levels.level_01;
	}

	@Override
	public void handActionRequest(actionRequest ar) {
		System.out.println("处理者1处理请求："+ar.getContent());
	}

}
