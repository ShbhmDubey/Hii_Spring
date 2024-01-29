package in.ineuron.bean;
//Target Object

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="fpkt")
@Scope(scopeName="prototype")
public class Flipkart {
	//Dependent Object
	@Autowired
	@Qualifier(value="bDart")
    private Courier courier;
    
    static {
    	System.out.println("Flipkart .class file loaded....");
    }
    
   public Flipkart(){
    	System.out.println("Flipkart Object is Created.....");
    }
   //Constructor Injection
   public Flipkart(Courier courier) {
	   System.out.println("Courier object is injected through Construtor of Flipkart");
	   this.courier=courier;
	   
   }
    public Courier getCourier() {
	return courier;
}
 //Setter Injection   
public void setCourier(Courier courier) {
	 System.out.println("Courier object is injected through Setter");
	this.courier = courier;
}
	public String shopping(String[] items,float[] prices) {
    	
    	System.out.println(courier.getClass().getName());
    	System.out.println("Flipkart.shopping()");
    	Random random=null;
    	float billAmnt=0.0f;
    	int oid=0;
    	
    	for(float price:prices) {
    		billAmnt+=price;
    	}
    	random=new Random();
    	oid=random.nextInt(1000);
    	String msg=courier.deliver(oid);
    	
    	
    	
    	
    	return Arrays.toString(items)+" are purchase having prices "+Arrays.toString(prices)+""
    			+ " with the bill amount :: "+billAmnt+" ------>"+msg;
    }
}
