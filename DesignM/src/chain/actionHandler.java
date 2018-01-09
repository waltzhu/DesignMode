package chain;

public abstract class actionHandler {

	public  actionHandler nextah=null;

	public  actionHandler getNextah() {
		return nextah;
	}

	public void setNextah(actionHandler nextah) {
		this.nextah = nextah;
	}

	public abstract int getActionHandlerLevel();
	
	public void actionHand(actionRequest ar){
		
		if(this.getActionHandlerLevel()==ar.getRequestLevel()){//当前handler有权限处理当前request
			this.handActionRequest(ar);//注意：当前节点处理
		}else{
			if(this.getNextah()!=null){//有下个处理节点
				System.out.println("当前处理者:"+this.getActionHandlerLevel()+"不足以处理请求:"+ar.getRequestLevel()+"-流转下个处理节点");
				this.getNextah().actionHand(ar);//递归调用
			}else{
				System.out.println("此问题干系重大，所有处理者无权限处理。请线下联系董事会助理");
			}
		}
	}
	
	public abstract void handActionRequest(actionRequest ar);
}
