/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpserver;

/**
 *
 * @author tanveer
 */
import java.io.*;// buffered / iostream  / data o/p stream
import java.net.*;//SocketCreation
public class TcpServer
{

     public static void main(String[] args) throws Exception
     {
       String clientData,serverdata;
       
       ServerSocket server=new ServerSocket(6789);
         while (true)
         {   try{          
             Socket con=server.accept();
             BufferedReader inFromClient=new BufferedReader(new InputStreamReader(con.getInputStream()));
             DataOutputStream toClient=new DataOutputStream(con.getOutputStream());
             clientData=inFromClient.readLine();
             serverdata="The dposited value is"+clientData;
                     System.out.println(serverdata);
             toClient.writeBytes(serverdata);    
         }
         catch(IOException e)
         {
         }
         }
    }
}
