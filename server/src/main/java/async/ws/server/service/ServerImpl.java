/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package async.ws.server.service;

import async.ws.server.processor.MessageProcessor;
import async.ws.server.processor.MessageProcessorSingleton;
import async.ws.server.repository.Repository;
import async.ws.server.repository.RepositorySingleton;
import javax.jws.WebService;

/**
 *
 * @author juan
 */
@WebService(
        endpointInterface = "async.ws.server.service.Server"
)
public class ServerImpl implements Server{

    Repository repo;
    MessageProcessor proc;
    
    public ServerImpl() {
        this.repo = RepositorySingleton.getInstance();
        this.proc = MessageProcessorSingleton.getInstance();
    }
    
    public void request(int id, String message) {
        System.out.println("requesting message processing by " + id);
        this.proc.enqueue(id, message);
    }

    public int registry() {
        System.out.println("requesting an id");
        return repo.getIdentifier();
    }

    public String response(int id) {
        System.out.println("requesting processed message of " + id);
        return repo.recoverResponse(id);
    }
    
}
