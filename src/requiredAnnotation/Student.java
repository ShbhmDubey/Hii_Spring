package requiredAnnotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import org.springframework.beans.factory.annotation.
@Component
@Scope(scopeName="prototype")
public class Student {
static {
	System.out.println("Student .class file is loading......");
}
public Student(){
	System.out.println("Student object is instantiated.....");
}

private int sid;
private String sname;
private int sal;

public int getSid() {
	return sid;
}
public String getSname() {
	return sname;
}
public int getSal() {
	return sal;
}
public void setSid(int sid) {
	this.sid = sid;
}
public void setSname(String sname) {
	this.sname = sname;
}
public void setSal(int sal) {
	this.sal = sal;
}
public void show() {
	System.out.println("Student id :"+sid+"name "+sname+"and salary is :"+sal);
}
}
