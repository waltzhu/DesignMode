package bridge;

public abstract class professional {
    public action ac;
    public void setAction(action action){
    	this.ac=action;
    }
    public action getAction(){
    	return ac;
    }
    //�ṩĬ��ʵ��
	public void run() {
		 System.out.println("׼����......");
		 this.ac.run();
	}

	public void fight() {
		 System.out.println("׼��ս��......");
		 this.ac.fight();
	}

	public void recovery() {
		 System.out.println("׼���ظ�......");
		 this.ac.recovery();
	}
}
