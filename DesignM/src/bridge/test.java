package bridge;

public class test {
	public static void main(String[] args) {
		//1.法师快速
		professional p1=new magicProfessional();
		p1.setAction(new quickAction());
		p1.run();
		p1.fight();
		p1.recovery();
		System.out.println("***********************************************");
		//2.法师慢慢
		professional p2=new magicProfessional();
		p2.setAction(new slowAction());
		p2.run();
		p2.fight();
		p2.recovery();
		System.out.println("***********************************************");
		//3.战士快速
		professional p3=new soliderProfessional();
		p3.setAction(new quickAction());
		p3.run();
		p3.fight();
		p3.recovery();
		System.out.println("***********************************************");
		//4.战士慢慢
		professional p4=new soliderProfessional();
		p4.setAction(new slowAction());
		p4.run();
		p4.fight();
		p4.recovery();
	}
}
