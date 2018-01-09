package build;

public class test {
  public static void main(String[] args) {
	  director dr=new director();
	  Product p=dr.bulidProduct();
	  
	  System.out.println(p.getA());
	  System.out.println(p.getB());
	  System.out.println(p.getC());
	  
	  //如果没有导演类
	  //问题：1.此客户端代码与建造耦合，如果建造修改，客户端也要改 2.没有封装，对外顺序管理太乱
	  productBuild pb=new productBuild();
	  pb.makeA();
	  pb.makeB();
	  pb.makeC();
	  pb.getProduct();
	  System.out.println(p.getA());
	  System.out.println(p.getB());
	  System.out.println(p.getC());
}
}
