package template;

public abstract class educationDay {
	public final void educationAll(){ //�����FINAL����ֹ������д
		getup();
		eat();
		gotoSchool();
	}
	public  abstract void getup();
	public abstract void eat();
	public abstract void gotoSchool();
}
