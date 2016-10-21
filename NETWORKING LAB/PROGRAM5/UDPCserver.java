import java.io.*;
import java.net.*;
class UDPCserver
{
public static void main(String args[]) throws IOException
			{
			DatagramSocket serverSocket = new DatagramSocket(9876);
            byte[] receivedata = new byte[1024];
            byte[] senddata = new byte[1024];
				while(true)
                {
                  DatagramPacket receivePacket = new DatagramPacket(receivedata,receivedata.length);
                  serverSocket.receive(receivePacket);
                  String sentence = new String( receivePacket.getData());
                  System.out.println(sentence+"\n");
				  sentence=sentence.trim();
				  System.out.println("length="+sentence.length());
				  char x;
				  int n=0;
				  int length1=sentence.length();
				  sentence=sentence+" ";
				  int length2=sentence.length();
				  for(int i=0;i<length2;i++)
				  {
				  x=sentence.charAt(i);
				  if(x==' ')
				  n=n+1;
				  }
				  System.out.println("No. of words="+n);
				  length1=length1-n+1;
				  System.out.println(length1);
				  InetAddress ipaddr=receivePacket.getAddress();
				  int port=receivePacket.getPort();
				  String len=Integer.toString(length1);
				  System.out.println("length="+len);
				  senddata=len.getBytes();
				  DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,ipaddr,port);
				  serverSocket.send(sendpacket);
				}
			}
}
				  
