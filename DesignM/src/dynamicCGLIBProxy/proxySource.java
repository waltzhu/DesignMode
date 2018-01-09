package dynamicCGLIBProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class proxySource implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();  
	
	 public Object getProxy(Class clazz){  
	  //设置需要创建子类的类  
	  enhancer.setSuperclass(clazz);  
	  enhancer.setCallback(this);  
	  //通过字节码技术动态创建子类实例  
	  return enhancer.create();  
	 }   
	
	@Override
	public Object intercept(Object obj, Method mth, Object[] arg2,
			MethodProxy mpx) throws Throwable {
		 System.out.println("proxy开始代理");
	        mpx.invokeSuper(obj, arg2);
	       System.out.println("proxy结束代理");
		return null;
	}
 
}
