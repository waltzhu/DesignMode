package observer;

public class gold extends goods {
	  
	  public gold(String state){
		  this.state=state;
		  System.out.println("���ǽ��ӻ����̶ӣ�׼��������Ŀǰ����״̬��"+state);
	  }
	  //���㶨�����вεĹ��췽��ʱ���Ͳ�������Լ���һ���ˣ�������ʱ����Ҫ�Լ�дһ���޲εġ�
	  public gold(){
		  
	  }
	public void setState(String state) {
		this.state = state;
		System.out.println("���ǽ��ӻ����̶ӣ���·�У�Ŀǰ����״̬��"+state);
		super.notifyObserver(state);
	}
}
