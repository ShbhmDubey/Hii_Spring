package in.ineuron.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import in.ineuron.bean.JavaConfig;
import in.ineuron.bean.Flipkart;

public class ClientApp {

	public static void main(String[] args) {
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		Flipkart flipkart=con.getBean("fpkt", Flipkart.class);
		String result=flipkart.shopping(new String[] {"fossil", "puma","iphone"},new float[] {1000.5f,1234.3f,200042.1f});
		System.out.println(result);
		((AbstractApplicationContext) con).close();
		
		

	}

}
