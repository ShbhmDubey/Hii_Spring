package ProjectSpring;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class TestApp {

	public static void main(String[] args) {
		System.out.println("shubham Dubey...");
		ApplicationContext con=new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println(con);
        Student student=con.getBean("firstStudent",Student.class);
        System.out.println("Connection is :"+con);
        System.out.println(student);
        student.getMessage();
	}

}
