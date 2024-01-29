package in.ineuron.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="dtdc")
@Scope(scopeName="prototype")
public class DTDC implements Courier {
	
	static {
    	System.out.println("DTDC.class file is loading....");
    }
  public  DTDC(){
    	System.out.println("DTDC object is instantiated....");
    }

	@Override
	public String deliver(int oid) {
		String str="Shopping is done by DTDC Vendor with order Id :"+oid;
		return str;
	}

}
