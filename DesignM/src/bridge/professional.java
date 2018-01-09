package bridge;

public abstract class professional {
    public action ac;
    public void setAction(action action){
    	this.ac=action;
    }
    public action getAction(){
    	return ac;
    }
    //提供默认实现
	public void run() {
		 System.out.println("准备跑......");
		 this.ac.run();
	}

	public void fight() {
		 System.out.println("准备战斗......");
		 this.ac.fight();
	}

	public void recovery() {
		 System.out.println("准备回复......");
		 this.ac.recovery();
	}
}
