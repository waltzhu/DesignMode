package chain;

public class request1 extends actionRequest {
  
	//����ʵ����ʱ�������ȵ��ø���Ĺ��캯��-�������û���޲Σ����಻�ܶ����޲�
	public request1(){}
	
	public request1(String content){
		super(content);
	}
	
	@Override
	public int getRequestLevel() {
		return levels.level_01;
	}

}
