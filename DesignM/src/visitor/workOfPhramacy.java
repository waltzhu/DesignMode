package visitor;

public class workOfPhramacy extends visitor {

	@Override
	public void visit(medicineA ma) {
		System.out.println("ҩ��ʦ"+super.getName()+"��ҩƷ"+ma.getName()+"����ȡ����"+ma.getPrice());
	}

	@Override
	public void visit(medicineB mb) {
		System.out.println("ҩ��ʦ"+super.getName()+"��ҩƷ"+mb.getName()+"����ȡ����"+mb.getPrice());
	}

}
