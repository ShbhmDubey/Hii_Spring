package AutowiredDemo;

import org.springframework.beans.factory.annotation.Value;

public class Engine {
	@Value(value="Farari")
   private String name;
	@Value(value="CH12345WQ")
   private String chesis;
public String getName() {
	System.out.println("Engine Name Getter is invoked");
	return name;
}
public String getChesis() {
	System.out.println("Engine Chesis Getter is invoked");
	return chesis;
}
public void setName(String name) {
	this.name = name;
}
public void setChesis(String chesis) {
	this.chesis = chesis;
}
static {
	System.out.println("Engine .class file is loading");
}
public Engine() {
	System.out.println("Engine object is instanciated.....");
}
}
