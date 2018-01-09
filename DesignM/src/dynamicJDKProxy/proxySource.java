package dynamicJDKProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class proxySource implements InvocationHandler {
	private Object obj;
	
	public proxySource(Object obj){
		this.obj=obj;
	}

	@Override
	public Object invoke(Object o, Method mth, Object[] objArray)
			throws Throwable {
	       System.out.println("proxy开始代理");
	       mth.invoke(obj, objArray);
	       System.out.println("proxy结束代理");
		return null;
	}
	
	public Object getProxy() {  
        return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),   
        		obj.getClass().getInterfaces(), this);  
    } 
}
