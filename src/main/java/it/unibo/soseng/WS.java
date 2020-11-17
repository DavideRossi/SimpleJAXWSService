package it.unibo.soseng;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public class WS {

    @WebMethod
    public String Hello(String name) {
        return "Hello "+name;
    }
}
