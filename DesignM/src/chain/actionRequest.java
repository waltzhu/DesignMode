package chain;

public abstract class actionRequest {
  public String content;
  
  //无参构造方法
  public actionRequest(){}
     //有参构造方法
	 public actionRequest(String content){
		 this.content=content;
	 }
 
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	  
	public abstract int getRequestLevel();
		
	
}
