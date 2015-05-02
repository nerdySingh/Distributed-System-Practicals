/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corbahelloserver;

import HelloApp.HelloPOA;
import org.omg.CORBA.ORB;

/**
 *
 * @author tanveer
 */
public class HelloServant extends HelloPOA{
private String message="hello world";
private ORB orb;

public void setORB(ORB orbval){
orb=orbval;

}
    @Override
    public String hellomessage() {
    return message;
    }

    @Override
    public void hellomessage(String newHellomessage) {
    message=newHellomessage;    
    }
    
}
