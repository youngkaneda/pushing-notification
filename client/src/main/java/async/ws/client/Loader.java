package async.ws.client;

import async.ws.notifier.service.Notifier;
import async.ws.notifier.service.NotifierImplService;
import async.ws.server.service.Server;
import async.ws.server.service.ServerImplService;

/**
 * Hello world!
 *
 */
public class Loader {
    public static void main( String[] args ){
        Notifier notifier = new NotifierImplService().getNotifierImplPort();
        Server server = new ServerImplService().getServerImplPort();
        //
        System.out.println("Client - requesting an id");
        int id = server.registry();
        System.out.println("Client - my_id " + id);
        //
        System.out.println("Client - sending a request");
        server.request(id, "my final message 2 you");
        //
        System.out.println("Client - subscribing and wait the notification");
        notifier.subscribe(id);
        //
        System.out.println("Client - requesting the message processed");
        String response = server.response(id);
        //
        System.out.println("Client - printing the returned response");
        System.out.println("Client - " + response);
    }
}
