package visitor;

public class workOfPhramacy extends visitor {

	@Override
	public void visit(medicineA ma) {
		System.out.println("药房师"+super.getName()+"对药品"+ma.getName()+"进行取出："+ma.getPrice());
	}

	@Override
	public void visit(medicineB mb) {
		System.out.println("药房师"+super.getName()+"对药品"+mb.getName()+"进行取出："+mb.getPrice());
	}

}
