package it.unibo.soseng;

import java.io.IOException;
import java.net.InetSocketAddress;

import javax.xml.ws.Endpoint;
import com.sun.net.httpserver.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) throws IOException
    {
        Endpoint endpoint = Endpoint.create(new WS());
        HttpServer httpsServer = HttpServer.create(new InetSocketAddress("localhost", 8888), 8888);
        HttpContext context = httpsServer.createContext("/ws");
        httpsServer.start();
        endpoint.publish(context);    
    }
}
