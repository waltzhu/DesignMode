package proxy;

public class proxySource implements soureAble {

	private source sr=new source();
	
	@Override
	public void operation() {
		// TODO Auto-generated method stub
       System.out.println("proxy开始代理");
       sr.operation();
       System.out.println("proxy结束代理");
	}

}
