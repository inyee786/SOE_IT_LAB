import java.io.*;
import java.net.*;
public class multiserver 
{
  public static void main(String args[])throws IOException
  {
	  System.out.println("Listening for Client...");
	  ServerSocket wsocket=new ServerSocket(6000);
	  while(true)
	  {
		  Socket csocket=wsocket.accept();
		  System.out.println("Connection is Established\n");
		  thread t=new thread(csocket);
		  t.start();
	  }
  }
}
class thread extends Thread
{
	Socket sock;
	public thread(Socket s)
	{
		sock=s;
	}
	public void run()
	{
		try
		{
			BufferedReader serverreply=new BufferedReader(new InputStreamReader(System.in));
			BufferedReader inFromClient=new BufferedReader(new InputStreamReader(sock.getInputStream()));
			DataOutputStream outToClient=new DataOutputStream(sock.getOutputStream());
			while(true)
			{
				String clientsentence=inFromClient.readLine();
				if(clientsentence.equals("exit"))
				{
					try
					{
						System.out.println("One Client is disconnected\n");
						this.join();
					}
					catch(InterruptedException e)
					{
						
					}
				}
				else
				{
					System.out.println(clientsentence);
					System.out.print("Reply");
					String reply=serverreply.readLine();
					outToClient.writeBytes(reply+'\n');
					System.out.println("waiting For message from Client\n");
				}
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
