/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package async.ws.server.repository;

import async.ws.notifier.service.Notifier;
import async.ws.notifier.service.NotifierImplService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/**
 *
 * @author juan
 */
public class Repository {

    private Map<Integer, String> response;
    private Set<Integer> identifiers;
    private Notifier notifier;
    private Thread t;

    public Repository() {
        notifier = new NotifierImplService().getNotifierImplPort();
        this.response = new HashMap<Integer, String>();
        this.identifiers = new HashSet<Integer>();
    }

    public int getIdentifier() {
        System.out.println("random id creation");
        int id = UUID.randomUUID().hashCode();
        if (!identifiers.add(id)) {
            return getIdentifier();
        }
        return id;
    }

    public String recoverResponse(int id) {
        System.out.println("returning processed message");
        identifiers.remove(id);
        return response.remove(id);
    }

    public void storeResponse(int id, String message) {
        //happens only once
        if(t == null) {
            t = new Thread(new OperationNotifier());
            t.start();
        }
        System.out.println("storing message and notifying client " + id);
        response.put(id, message);
    }

    private class OperationNotifier implements Runnable {

        public void run() {
            while (true) {
                Iterator<Integer> iterator = response.keySet().iterator();
                if (!iterator.hasNext()) {
                    try {
                        System.out.println("Server - no id to notify about the processed message stored, waiting ...");
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                        System.out.println("OperationNotifier thread error: " + ex.getMessage());
                    }
                } else {
                    System.out.println("Server - notifiying each subscribed id");
                    while (iterator.hasNext()) {                        
                        notifier.notify(iterator.next());
                    }
                }
            }
        }

    }
}
