package visitor;

public class test {
  public static void main(String[] args) {
	
	  medicine ma=new medicineA("A药","100");
	  medicine mb=new medicineB("B药","200");
	  prescription psc=new prescription();
	  psc.addMedicine(ma);
	  psc.addMedicine(mb);
	  
	  visitor vic=new charger();
	  vic.setName("划价师666");
	  visitor viw=new workOfPhramacy();
	  viw.setName("药品师888");
	  
	  psc.accept(vic);
	  psc.accept(viw);
	  
}
}
