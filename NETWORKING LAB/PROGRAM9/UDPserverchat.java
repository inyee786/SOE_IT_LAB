
import java.io.*;
import java.net.*;
public class UDPserverchat
{
 public static void main(String args[])throws IOException
 {
	 DatagramSocket serversocket=new DatagramSocket(9876);
	 byte[] receivedata=new byte[100];
	 byte[] senddata=new byte[100];
	 BufferedReader infromclient=new BufferedReader(new InputStreamReader(System.in));
	 while(true)
	 {
		 DatagramPacket receivepacket=new DatagramPacket(receivedata,receivedata.length);
		 serversocket.receive(receivepacket);
		 String sentence=new String(receivepacket.getData());
		 System.out.println("Received:"+sentence);
		 InetAddress ipaddr=receivepacket.getAddress();
		 int port=receivepacket.getPort();
		 System.out.println("From Server:");
		 String sentence1=infromclient.readLine();
		 senddata=sentence1.getBytes();
		 DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,ipaddr,port);
		 serversocket.send(sendpacket);
	 }
	 
 }
}
