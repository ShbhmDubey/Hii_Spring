package in.ineuron.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="fFlight")
@Scope(scopeName="prototype")
public class FirstFlight implements Courier {
    static {
    	System.out.println("FirstFlight.class file is loading....");
    }
    FirstFlight(){
    	System.out.println("FirstFlight object is instantiated....");
    }
	@Override
	public String deliver(int oid) {
		String str="Shopping is done by FirstFlight Vendor with order Id :"+oid;
		return str;
	}

}
