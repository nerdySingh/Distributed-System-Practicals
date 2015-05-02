/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

/**
 *
 * @author tanveer
 */
import java.net.*;
import java.io.*;
public class TcpClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        String Clientdata,serverdata;
        while(true)
        {
        System.out.println("Enetr the data to be sent to the server");
        BufferedReader userInput=new BufferedReader(new InputStreamReader(System.in));
        Socket con=new Socket("localhost", 6789);
        DataOutputStream sendtoServer=new DataOutputStream(con.getOutputStream());
        BufferedReader getFromServer=new BufferedReader(new InputStreamReader(con.getInputStream()));
        Clientdata=userInput.readLine();
        serverdata="chutiya input dekha kya"+Clientdata;
        sendtoServer.writeBytes(serverdata);
            System.out.println(getFromServer.readLine());
        con.close();
        }
    }
}
