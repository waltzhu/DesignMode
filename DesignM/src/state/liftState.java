package state;

public abstract class liftState {
    private context context;
    
	public context getContext() {
		return context;
	}
	public void setContext(context context) {
		this.context = context;
	}
	//���ȵ����ſ�������  
    public abstract void open();  
    //�������п������ǵ�ȻҲ���йر���  
    public abstract void close();  
    //����Ҫ�������£�������  
    public abstract void run();  
    //���ݻ�Ҫ��ͣ������ͣ�������Ǿͳ�����  
    public abstract void stop();  
}
