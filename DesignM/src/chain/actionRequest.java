package chain;

public abstract class actionRequest {
  public String content;
  
  //�޲ι��췽��
  public actionRequest(){}
     //�вι��췽��
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
