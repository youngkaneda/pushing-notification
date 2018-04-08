/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package async.ws.notifier.service;

import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author juan
 */
@WebService(
        name = "Notifier"
)
public interface Notifier {
    @WebMethod
    public void subscribe(int id);
    @WebMethod
    @Oneway
    public void notify(int id);
}
