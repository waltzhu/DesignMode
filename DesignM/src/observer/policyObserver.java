package observer;

public class policyObserver implements observer{
	public String state;
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public void update(String state) {
		 System.out.println("�����յ�֪ͨ��Ŀǰ����״̬��"+state);
	}
}