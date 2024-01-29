package requiredAnnotation;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import AnnotationDemo.Config;

public class ClientTest {

	private static ApplicationContext con;

	public static void main(String[] args)throws Exception {
		con = new AnnotationConfigApplicationContext(Config.class);
		Student s=con.getBean("p",Student.class);
		Student s1=con.getBean("p",Student.class);
		Student s2=con.getBean("q",Student.class);
		s.show();
		s1.show();
		s2.show();
		//((AbstractApplicationContext) con).close();
	}

}
