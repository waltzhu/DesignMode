package facade;

public class cpu implements electOperate{
	@Override
	public void start() {
		 System.out.println("cpu is start......");
	}
	@Override
	public void close() {
		 System.out.println("cpu is close......");
	}
}
