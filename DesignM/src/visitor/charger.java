package visitor;

public class charger extends visitor {


	@Override
	public void visit(medicineA ma) {
		 System.out.println("����ʦ"+super.getName()+"��ҩƷ"+ma.getName()+"���л��ۣ�"+ma.getPrice());
	}

	@Override
	public void visit(medicineB mb) {
		System.out.println("����ʦ"+super.getName()+"��ҩƷ"+mb.getName()+"���л��ۣ�"+mb.getPrice());
	}
 

}
