/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package udpserver;
import java.net.*;
import java.io.*;
public class UDPServer {

     public static void main(String[] args) throws Exception
    {
       DatagramSocket con=new DatagramSocket(6789);
       byte[] receive=new byte[1024];
       byte[]send;
        while (true)
        {            
            DatagramPacket recievePacket=new DatagramPacket(receive, receive.length);
            con.receive(recievePacket);
            String data=new String(recievePacket.getData(),0, recievePacket.getLength());
            InetAddress ip=recievePacket.getAddress();
            int port=recievePacket.getPort();
            System.out.println("Server received:\t" +data);
            send=data.getBytes();
            DatagramPacket sendPacket = new DatagramPacket(send, send.length, ip, port);
            con.send(sendPacket);
        }
    }
}
