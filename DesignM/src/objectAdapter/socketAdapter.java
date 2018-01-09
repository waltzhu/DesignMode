package objectAdapter;

public class socketAdapter implements germanyTwoSocketInter{
	public chinaThreeSocketInter chinaThreeSocketInter;
	public socketAdapter(chinaThreeSocketInter ctsi) {
		 this.chinaThreeSocketInter=ctsi;
	}
	@Override
	public void germanyCharge() {
		 this.chinaThreeSocketInter.chinaCharge();
	}
}
