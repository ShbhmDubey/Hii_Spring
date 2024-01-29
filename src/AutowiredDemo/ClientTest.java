package AutowiredDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

//import AnnotationDemo.Config;

public class ClientTest {
	public static void main(String[] args) {

	ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
	Car c=con.getBean("c",Car.class);
	c.show();
((AbstractApplicationContext) con).close();
	}
	
}
