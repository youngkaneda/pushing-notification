package async.ws.notifier;

import async.ws.notifier.service.NotifierImpl;
import javax.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class Loader {
    public static void main( String[] args ){
        Endpoint.publish("http://localhost:9090/Notifier", new NotifierImpl());
    }
}
