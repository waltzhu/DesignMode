package chain;

public class request3 extends actionRequest {
  
	//����ʵ����ʱ�������ȵ��ø���Ĺ��캯��-�������û���޲Σ����಻�ܶ����޲�
	public request3(){}
	
	public request3(String content){
		super(content);
	}
	
	@Override
	public int getRequestLevel() {
		return levels.level_03;
	}

}
