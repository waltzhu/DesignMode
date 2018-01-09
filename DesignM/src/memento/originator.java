package memento;

public class originator {
  public String name;
  public String sex;
  public String phone;
  public String address;
  public String email;
	public originator(String name, String sex, String phone, String address,
		String email) {
	super();
	this.name = name;
	this.sex = sex;
	this.phone = phone;
	this.address = address;
	this.email = email;
}
	//备份操作
	public memento copyOrigin(){
		return new memento(this);
	}
	//还原操作
	public void recoverOrigin(memento mem){
		this.address=mem.getAddress();
		this.phone=mem.getPhone();
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
