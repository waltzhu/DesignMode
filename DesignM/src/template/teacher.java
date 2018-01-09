package template;

public class teacher extends educationDay {

	@Override
	public void getup() {
		System.out.println("我是老师，要起床了！");
	}

	@Override
	public void eat() {
		System.out.println("我是老师，要吃早饭了！");
	}

	@Override
	public void gotoSchool() {
		System.out.println("我是老师，要坐公交去学校了！");
	}

}
