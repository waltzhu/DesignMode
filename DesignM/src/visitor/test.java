package visitor;

public class test {
  public static void main(String[] args) {
	
	  medicine ma=new medicineA("Aҩ","100");
	  medicine mb=new medicineB("Bҩ","200");
	  prescription psc=new prescription();
	  psc.addMedicine(ma);
	  psc.addMedicine(mb);
	  
	  visitor vic=new charger();
	  vic.setName("����ʦ666");
	  visitor viw=new workOfPhramacy();
	  viw.setName("ҩƷʦ888");
	  
	  psc.accept(vic);
	  psc.accept(viw);
	  
}
}
