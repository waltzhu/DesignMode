package observer;

public class securityObserver implements observer {
	public String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public void update(String state) {
		 System.out.println("保镖收到通知，目前货物状态："+state);
	}
}
