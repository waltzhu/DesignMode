package flyWeight;

import java.util.Hashtable;
import java.util.Map;

public class flyWeightFactory {
	Map fwf=new Hashtable();
	public flyWeight getFlyWeight(Object obj){
		flyWeight flyweight = (flyWeight) fwf.get(obj); 
		if(flyweight == null){ 
			//产生新的ConcreteFlyweight  
			flyweight = new myFlyWeight((String)obj);  
			fwf.put(obj, flyweight); 
		}
		return flyweight;
	}
	public int getFlyweightSize(){  
		return fwf.size();  
	} 
}
