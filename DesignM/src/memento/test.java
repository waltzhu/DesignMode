package memento;

public class test {
  public static void main(String[] args) {
	 
	  originator og=new originator("walt","M", "1380000000", "pudong", "walt@126.com");
	  System.out.println("原始属性为：");
	  System.out.println(og.getName()+"-"+og.getSex()+"-"+og.getPhone()+"-"+og.getAddress()+"-"+og.getEmail());
	  
	  //进行备份操作
	  careTaker ct=new careTaker();
	  ct.setMem( og.copyOrigin());
	  
	  //变更操作
	  og.setAddress("pudong chuansha"); 
	  og.setPhone("171000000");
	  System.out.println("变更后属性为：");
	  System.out.println(og.getName()+"-"+og.getSex()+"-"+og.getPhone()+"-"+og.getAddress()+"-"+og.getEmail());
	  
	  //还原操作
	  og.recoverOrigin(ct.getMem());
	  System.out.println("恢复后属性为：");
	  System.out.println(og.getName()+"-"+og.getSex()+"-"+og.getPhone()+"-"+og.getAddress()+"-"+og.getEmail());
	  
	  
  }
}
