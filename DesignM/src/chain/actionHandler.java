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
		
		if(this.getActionHandlerLevel()==ar.getRequestLevel()){//��ǰhandler��Ȩ�޴���ǰrequest
			this.handActionRequest(ar);//ע�⣺��ǰ�ڵ㴦��
		}else{
			if(this.getNextah()!=null){//���¸�����ڵ�
				System.out.println("��ǰ������:"+this.getActionHandlerLevel()+"�����Դ�������:"+ar.getRequestLevel()+"-��ת�¸�����ڵ�");
				this.getNextah().actionHand(ar);//�ݹ����
			}else{
				System.out.println("�������ϵ�ش����д�������Ȩ�޴�����������ϵ���»�����");
			}
		}
	}
	
	public abstract void handActionRequest(actionRequest ar);
}
