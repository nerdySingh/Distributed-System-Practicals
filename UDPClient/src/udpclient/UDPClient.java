
package udpclient;
import java.net.*;
import java.io.*;
public class UDPClient
{

     public static void main(String[] args) throws Exception
    {
        
        while(true)
        {
        System.out.println("Enter the data to  be sent to thte user");
        BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket con=new DatagramSocket();
        byte[]sendData;
        byte[]receiveData=new byte[1024];
        InetAddress ip=InetAddress.getByName("localhost");
        String data=inFromUser.readLine();
        sendData=data.getBytes();
        DatagramPacket sendPacket= new DatagramPacket(sendData,sendData.length,ip,6789);
        con.send(sendPacket);
        DatagramPacket receivePacket=new DatagramPacket(receiveData,receiveData.length);
        con.receive(receivePacket);
        String dataRecept=new String(receivePacket.getData(),0,receivePacket.getLength());
        System.out.println("SERVER SENT:\t" +dataRecept);
        con.close();
    }
    }    
}
