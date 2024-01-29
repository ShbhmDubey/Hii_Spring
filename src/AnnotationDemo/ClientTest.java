package AnnotationDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import ProjectSpring.JavaConfig;

public class ClientTest {

	public static void main(String[] args)//throws Exception
	{
		ApplicationContext con=new AnnotationConfigApplicationContext(Config.class);
		System.out.println(con);
        Company c=con.getBean("c",Company.class);
        System.out.println(c);
        c.messageByCompany();
        Employee e=con.getBean("e",Employee.class);
        e.show();
     //  ((AbstractApplicationContext) con).close();
       Employee e1=con.getBean("e",Employee.class);;
       e1.show();

	}

}
