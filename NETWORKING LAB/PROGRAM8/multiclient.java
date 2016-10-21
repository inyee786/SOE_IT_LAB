import java.io.*;
import java.net.*;
public class multiclient
{
public static void main(String args[])throws IOException
    {
	 String sentence="",replysentence;
	 String name="";
	 BufferedReader inFromUser=new BufferedReader(new InputStreamReader(System.in));
	 Socket client=new Socket("localhost",6000);
	 DataOutputStream outToServer=new DataOutputStream(client.getOutputStream());
	 BufferedReader inFromServer=new BufferedReader(new InputStreamReader(client.getInputStream()));
	 System.out.println("Your Name:");
	 name=inFromUser.readLine();
	 System.out.println("\nEnter message for server pr write exit...\n");
	 while(true)
	 {
		 System.out.println(name+":");
		 sentence=inFromUser.readLine();
		 outToServer.writeBytes(name+":"+sentence+"\n");
		 if(sentence.equals("exit"))
			 break;
		 System.out.println("Waiting for reply...\n");
		 replysentence=inFromServer.readLine();
		 System.out.println("Server:"+replysentence);
	 }
	 client.close();
	}
}
