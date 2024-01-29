package AnnotationDemo;

public class Company {
  private Employee emp;

public Employee getEmp() {
	System.out.println("Getter of employee field present in Company");
	return emp;
}

public void setEmp(Employee emp) {
	System.out.println("Setter of employee field present in Company");

	this.emp = emp;
}
public void messageByCompany() {
	System.out.println("Company will provide multiple employee according to my use");
}

  
}
