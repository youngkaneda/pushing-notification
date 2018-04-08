/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package async.ws.server.processor;

import async.ws.server.repository.Repository;
import async.ws.server.repository.RepositorySingleton;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author juan
 */
public class MessageProcessor {

    private Repository repo;
    private Queue<Integer> queue;
    private HashMap<Integer, String> messages;
    Thread t;

    public MessageProcessor() {
        repo = RepositorySingleton.getInstance();
        queue = new LinkedList();
        messages = new HashMap();
    }
    
    public void enqueue(int id, String message) {
        if (t == null) {
            t = new Thread(new OperationProcessor());
            t.start();
        }
        System.out.println("Server - adding id to the queue");
        queue.add(id);
        System.out.println("scheduling the process of message :" + message);
        messages.put(id, message);
    }

    private class OperationProcessor implements Runnable {

        public OperationProcessor() {
        }

        public void run() {
            while (true) {
                while (queue.isEmpty()) {
                    try {
                        System.out.println("Server - empty queue ... waiting");
                        Thread.sleep(3000);
                    } catch (InterruptedException ex) {
                        System.out.println("OperationProcessor thread error: " + ex.getMessage());
                    }
                }
                Integer id = queue.poll();
                System.out.println("Server - polling user id - " + id);
                String message = messages.remove(id);
                repo.storeResponse(id, "processed: " + message);
                System.out.println("Server - message processed");
            }
        }

    }

}
