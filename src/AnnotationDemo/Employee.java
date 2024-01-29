package AnnotationDemo;

import org.springframework.beans.factory.annotation.Value;

public class Employee {
	@Value("23")
 private int eid;
	@Value("Shubham")
private String ename;
	@Value("37000")
private int salary;
public int getEid() {
	System.out.println("Getter of employee id field present in Employee");

	return eid;
}
public String getEname() {
	System.out.println("Getter of employee name field present in Employee");

	return ename;
}
public int getSalary() {
	System.out.println("Getter of employee salary field present in Employee");

	return salary;
}
public void setEid(int eid) {
	System.out.println("Setter of employee field present in Employee");

	this.eid = eid;
}
public void setEname(String ename) {
	System.out.println("Setter of employee field present in Employee");

	this.ename = ename;
}
public void setSalary(int salary) {
	System.out.println("Setter of employee field present in Employee");

	this.salary = salary;
}
public void show() {
	System.out.println("Name is :"+ename+" Id is :"+eid+" salary is :"+salary);
}


}
