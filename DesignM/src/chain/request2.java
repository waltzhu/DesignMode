package chain;

public class request2 extends actionRequest {
  
	//����ʵ����ʱ�������ȵ��ø���Ĺ��캯��-�������û���޲Σ����಻�ܶ����޲�
	public request2(){}
	
	public request2(String content){
		super(content);
	}
	
	@Override
	public int getRequestLevel() {
		return levels.level_02;
	}

}
