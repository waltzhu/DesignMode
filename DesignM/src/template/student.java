package template;

public class student extends educationDay {

	@Override
	public void getup() {
		 System.out.println("我是学生，要起床了！");
	}

	@Override
	public void eat() {
		 System.out.println("我是学生，要吃早饭了！");
	}

	@Override
	public void gotoSchool() {
		 System.out.println("我是学生，要坐公交去学校了！");
	}

}
