/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package corbahelloserver;

import HelloApp.Hello;
import HelloApp.HelloHelper;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContext;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

/**
 *
 * @author tanveer
 */
public class CorbaHelloServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
         
            ORB orb=ORB.init(args,null);
            POA rootPOA= POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();
            HelloServant servant=new HelloServant();
            servant.setORB(orb);
            org.omg.CORBA.Object ref=rootPOA.servant_to_reference(servant);
            Hello href=HelloHelper.narrow(ref);
            org.omg.CORBA.Object objref=orb.resolve_initial_references("NameService");
            NamingContextExt ncRef= NamingContextExtHelper.narrow(objref);
            NameComponent path[]=ncRef.to_name("ABC");
            ncRef.rebind(path, href);
            System.out.println("Derver is waiting and running");
            for(;;){
            orb.run();
            }
        } 
        catch (Exception e) {
            System.err.println("Error :"+e);
            e.printStackTrace(System.out);
        }
    }
}
