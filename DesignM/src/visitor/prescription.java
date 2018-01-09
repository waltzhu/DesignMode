package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class prescription {
    private List<medicine> medicineList=new ArrayList<medicine>();

	public List<medicine> getMedicineList() {
		return medicineList;
	}
	
	public void setMedicineList(List<medicine> medicineList) {
		this.medicineList = medicineList;
	}
   
    public void addMedicine(medicine mc){
    	this.medicineList.add(mc);
    }
    
    public void removeMedicine(medicine mc){
    	this.medicineList.remove(mc);
    }
	
    //药品组合单子集合，作为上一层，要提供被访问的方法
	public void accept(visitor vis){
		Iterator<medicine> its=this.medicineList.iterator();
		while(its.hasNext()){
			 medicine me=(medicine)its.next();
			 me.accept(vis);
		}
		
	}
   
    
}
