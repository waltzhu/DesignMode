package dynamicCGLIBProxy;


public class test {
  public static void main(String[] args) {
	    
	   proxySource ps=new proxySource();
	   
	   source sr=(source) ps.getProxy(source.class);
	   
	   sr.operation();
}
}
