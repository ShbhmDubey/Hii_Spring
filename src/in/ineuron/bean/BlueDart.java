package in.ineuron.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="bDart")
@Scope(scopeName="prototype")
public class BlueDart implements Courier {
	static {
    	System.out.println("BlueDart.class file is loading....");
    }
	BlueDart(){
    	System.out.println("BlueDart object is instantiated....");
    }
	@Override
	public String deliver(int oid) {
		String str="Shopping is done by BlueDart Vendor with order Id :"+oid;
		return str;
	}

}
