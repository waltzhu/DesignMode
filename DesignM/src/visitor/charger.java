package visitor;

public class charger extends visitor {


	@Override
	public void visit(medicineA ma) {
		 System.out.println("划价师"+super.getName()+"对药品"+ma.getName()+"进行划价："+ma.getPrice());
	}

	@Override
	public void visit(medicineB mb) {
		System.out.println("划价师"+super.getName()+"对药品"+mb.getName()+"进行划价："+mb.getPrice());
	}
 

}
