package dynamicCGLIBProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class proxySource implements MethodInterceptor {

	private Enhancer enhancer = new Enhancer();  
	
	 public Object getProxy(Class clazz){  
	  //������Ҫ�����������  
	  enhancer.setSuperclass(clazz);  
	  enhancer.setCallback(this);  
	  //ͨ���ֽ��뼼����̬��������ʵ��  
	  return enhancer.create();  
	 }   
	
	@Override
	public Object intercept(Object obj, Method mth, Object[] arg2,
			MethodProxy mpx) throws Throwable {
		 System.out.println("proxy��ʼ����");
	        mpx.invokeSuper(obj, arg2);
	       System.out.println("proxy��������");
		return null;
	}
 
}
