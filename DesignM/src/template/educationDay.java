package template;

public abstract class educationDay {
	public final void educationAll(){ //定义成FINAL，防止子类重写
		getup();
		eat();
		gotoSchool();
	}
	public  abstract void getup();
	public abstract void eat();
	public abstract void gotoSchool();
}
