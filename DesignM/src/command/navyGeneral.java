package command;

public class navyGeneral implements general{
   public command ca;
   public navyGeneral(navyCommand navyCommand){//�����и����ɣ��������ͣ���ֹԽȨ
	   this.ca=navyCommand;
   }
	@Override
	public void eat() {
		this.ca.eat();
	}
	@Override
	public void fight() {
		this.ca.fight();
	}
	@Override
	public void meeting() {
		 System.out.println("this is navy general self meeting......");
	}
}
