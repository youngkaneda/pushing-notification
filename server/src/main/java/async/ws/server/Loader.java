package async.ws.server;

import async.ws.server.service.ServerImpl;
import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class Loader {
    public static void main( String[] args ){
        Endpoint.publish("http://localhost:9091/Server", new ServerImpl());
    }
}
