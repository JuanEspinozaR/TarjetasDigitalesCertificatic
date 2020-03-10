
package org.certificatic.tarjetaDigital;

import javax.jws.WebService;

@WebService(endpointInterface = "org.certificatic.tarjetaDigital.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello friend " + text;
    }

	@Override
	public String sayBye(String text) {
		return "See you soon friend " + text;
	}
    
}

