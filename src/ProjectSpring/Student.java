package ProjectSpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;



@Component("firstStudent")
public class Student {
	static {
		System.out.println("Static block loads.....");
	}
  
	public int getSid() {
		return sid;
	}
   
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	 @Value("37")
	int sid;
	 @Value("Shubham Dubey")
	String name;
	 @Value("Google")
	String company;
	 @Value("64.4")
	float salary;
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", " + (name != null ? "name=" + name + ", " : "")
				+ (company != null ? "company=" + company + ", " : "") + "salary=" + salary + "]";
	}

	Student(){
		System.out.println("Student.class file is loading....");
	}
	public void getMessage() {
		System.out.println("Student is reading the book...");
	}
}
