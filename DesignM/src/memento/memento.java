package memento;

public class memento {
	  public String address;
	  public String phone;
	  
	public memento(originator origin) {
		 this.address=origin.getAddress();
		 this.phone=origin.getPhone();//���ֱ���
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
