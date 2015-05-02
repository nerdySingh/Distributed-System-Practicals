/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;


import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author tanveer
 */
@WebService(serviceName = "Methods")
public class Methods {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addd")
    
    public int addd(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
    int c=a+b;
    return c;
    }
}
