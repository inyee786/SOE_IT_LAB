import java.io.*;
import java.net.*;
class UDPCclient
{
public static void main(String args[]) throws IOException
{
DatagramSocket clientSocket = new DatagramSocket();
byte[] receivedata=new byte[5];
byte[] senddata= new byte[1024];
BufferedReader inFromUser =
         new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the sentence");
String sentence = inFromUser.readLine();
senddata=sentence.getBytes();
InetAddress ipaddr=InetAddress.getByName("localhost");
int port=9876;

DatagramPacket sendPacket=new DatagramPacket(senddata,senddata.length,ipaddr,port);
      clientSocket.send(sendPacket);
      DatagramPacket receivePacket = new DatagramPacket(receivedata, receivedata.length);
      clientSocket.receive(receivePacket);
String len2=new String(receivePacket.getData());
System.out.println("From Server:\n length="+len2);
clientSocket.close();
}
}
