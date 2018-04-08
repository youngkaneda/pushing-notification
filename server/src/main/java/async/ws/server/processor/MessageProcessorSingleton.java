/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package async.ws.server.processor;

/**
 *
 * @author juan
 */
public class MessageProcessorSingleton {
    
    private static MessageProcessor instance;
    
    public static MessageProcessor getInstance() {
        if(instance == null)
            return instance = new MessageProcessor();
        return instance;
    }
}
