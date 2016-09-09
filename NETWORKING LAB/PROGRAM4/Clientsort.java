import java.io.*;
import java.net.*;
public class Clientsort {

	
	public static void main(String args[])throws IOException
	{
		String sentence;
		String modifiedsentence;
		int n;
		String name[]=new String[100];
		BufferedReader infromuser = new BufferedReader(new InputStreamReader(System.in));
		Socket clientsocket = new Socket("localhost",6789);
		DataOutputStream outtoserver = new DataOutputStream(clientsocket.getOutputStream());
		BufferedReader infromserver = new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
		System.out.println("Enter the no. of name");
		n=Integer.parseInt(infromuser.readLine());
		outtoserver.writeBytes(n+"\n");
		System.out.println("Enter the names");
		for(int i=0;i<n;i++)
				{name[i]=infromuser.readLine();
				outtoserver.writeBytes(name[i]+"\n");
				
			    }
		System.out.println("From Server:\n");
		for(int i=0;i<n;i++)
		{
			name[i]=infromserver.readLine();
			System.out.println(name[i]);
		}
		
		clientsocket.close();
		
	}
}
