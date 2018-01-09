package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class goods {
  public List<observer> observerList=new ArrayList<observer>();
  public String state;
	  public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}

	public void addObserver(observer obj){
		  this.observerList.add(obj);
	  }
	  
	  public void deleteObserver(observer obj){
		  this.observerList.remove(obj);
	  }
	  
	  public void notifyObserver(String state){
		  for(observer obj:observerList)
		  {
			  obj.update(state);
		  }
	  }
}
