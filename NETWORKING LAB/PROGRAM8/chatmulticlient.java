import java.io.*;
import java.net.*;
public class chatmulticlient 
{
 public static void main(String args[])throws IOException
 {
	 String sentence=" ",name=" ",replysentence;
	 BufferedReader infromuser=new BufferedReader(new InputStreamReader(System.in));
	 Socket clientsocket=new Socket("localhost",6000);
	 DataOutputStream outToServer=new DataOutputStream(clientsocket.getOutputStream());
	 BufferedReader infromserver=new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
	 System.out.print("Your Name:");
	 name=infromuser.readLine();
	 System.out.print("Enter Message For The server of write Exit");
	 while(true)
	 {
		 System.out.print(name+":");
		 sentence=infromuser.readLine();
		 outToServer.writeBytes(name+":"+sentence+'\n');
		 if(sentence.equals("exit"))
			 break;
		 System.out.println("Waiting for reply:\n\n");
		 replysentence=infromserver.readLine();
		 System.out.println("FromServer:"+replysentence);
	 }
	 clientsocket.close();
 }
}
