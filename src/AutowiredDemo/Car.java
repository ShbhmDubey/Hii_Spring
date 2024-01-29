package AutowiredDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	@Autowired
   Engine engine;

public Engine getEngine() {
	return engine;
}

public void setEngine(Engine engine) {
	this.engine = engine;
}

public void show() {
	System.out.println(engine.getName()+" "+engine.getChesis());
}
static {
	System.out.println("Car .class file is loaded.... ");
}
public Car() {
	System.out.println("Car object is instanciated....");
}
   
}
