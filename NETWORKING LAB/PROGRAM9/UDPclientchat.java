import java.io.*;
import java.net.*;
public class UDPclientchat 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader infromuser=new BufferedReader(new InputStreamReader(System.in));
		DatagramSocket clientsocket=new DatagramSocket();
		InetAddress ipadd=InetAddress.getByName("localhost");
		byte[] senddata=new byte[100];
		byte[] receivedata=new byte[100];
		while(true)
		{
			String sentence=infromuser.readLine();
			senddata=sentence.getBytes();
			DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,ipadd,9876);
			clientsocket.send(sendpacket);
			DatagramPacket receivepacket=new DatagramPacket(receivedata,receivedata.length);
			clientsocket.receive(receivepacket);
			String modifiedsentence=new String(receivepacket.getData());
			System.out.println("From Server:"+modifiedsentence);
		}
	}

}
