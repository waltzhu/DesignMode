package build;

import java.util.concurrent.Executors;

public class director {
   public build bl;
   public director(){
	   this.bl=new productBuild(); 
   }
   public Product bulidProduct(){
	   bl.makeA();
	   bl.makeB();
	   bl.makeC();
	   return bl.getProduct();
   }
   
    
}
