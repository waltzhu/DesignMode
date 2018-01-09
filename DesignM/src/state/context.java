package state;

public class context {
   
	public final static  openState openState=new openState();
	public final static  closeState closeState=new closeState();
	public final static  runState runState=new runState();
	public final static  stopState stopState=new stopState();
	
	
	private liftState liftState;


	public liftState getLiftState() {
		return liftState;
	}


	public void setLiftState(liftState liftState) {
		this.liftState = liftState;
        //把当前的环境通知到各个实现类中  
        this.liftState.setContext(this); 
	}
	
	public void open(){
		this.liftState.open();
	}
	
	public void close(){
		this.liftState.close();
	}
	
	public void run(){
		this.liftState.run();
	}
	
	public void stop(){
		this.liftState.stop();
	}
	
}
