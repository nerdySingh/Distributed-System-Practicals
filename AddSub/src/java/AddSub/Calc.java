/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AddSub;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author tanveer
 */
@WebService(serviceName = "Calc")
public class Calc {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Add")
    public int Add(@WebParam(name = "a") int a, @WebParam(name = "b") int b, @WebParam(name = "result") int result) {
        int c;
        //TODO write your implementation code here:
        return  c= a+b+result;
        
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "Sub")
    public Integer Sub(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        int result;
        //TODO write your implementation code here:
        return result=a-b;
    }
}
