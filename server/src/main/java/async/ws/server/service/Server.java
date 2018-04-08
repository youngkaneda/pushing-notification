/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package async.ws.server.service;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author juan
 */
@WebService(
        name = "Server"
)
public interface Server {
    
    @WebMethod
    @Oneway
    public void request(int id, String message);
    
    @WebMethod
    public int registry();
    
    @WebMethod
    public String response(int id);
}
