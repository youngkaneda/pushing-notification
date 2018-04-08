/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package async.ws.notifier.service;

import java.util.HashSet;
import java.util.Set;
import javax.jws.WebService;

/**
 *
 * @author juan
 */
@WebService(
        endpointInterface = "async.ws.notifier.service.Notifier"
)
public class NotifierImpl implements Notifier {

    private static Set<Integer> identifiers = new HashSet<Integer>();

    public NotifierImpl() {
    }

    @Override
    public void subscribe(int id) {
        identifiers.add(id);
        while (identifiers.contains(id)) {
            try {
                System.out.println("Notifier - waiting for the end to come (8)");
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                System.out.println("Notifier.subscribe thread error: " + ex.getMessage());
            }
        }
    }

    @Override
    public void notify(int id) {
        identifiers.remove(id);
        System.out.println(id+" is now notified");
    }

}
