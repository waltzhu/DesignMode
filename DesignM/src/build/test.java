package build;

public class test {
  public static void main(String[] args) {
	  director dr=new director();
	  Product p=dr.bulidProduct();
	  
	  System.out.println(p.getA());
	  System.out.println(p.getB());
	  System.out.println(p.getC());
	  
	  //���û�е�����
	  //���⣺1.�˿ͻ��˴����뽨����ϣ���������޸ģ��ͻ���ҲҪ�� 2.û�з�װ������˳�����̫��
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
