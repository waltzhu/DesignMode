package protoType;

public class proto implements Cloneable{
	public String name="";
	public String sex="";
    user ue=new user();
	public user getUe() {
		return ue;
	}
	public void setUe(user ue) {
		this.ue = ue;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		proto pt= (proto)super.clone();
		pt.ue=(user) ue.clone();
		return pt;
	} 
}
