import java.io.*;
import java.net.*;
public class Serversort {

	public static void main(String args[])throws IOException
	{
		String clientsentence;
		String capitalsentence;
		ServerSocket welcomesocket = new ServerSocket(6789);
		String names[]= new String[100];
		while(true)
		{
			Socket connectionsocket = welcomesocket.accept();
			BufferedReader infromclient = new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
			DataOutputStream outtoclient = new DataOutputStream(connectionsocket.getOutputStream());
			int n=Integer.parseInt(infromclient.readLine());
			System.out.println("Number of names="+n);
			for(int i=0;i<n;i++)
			{
				names[i]=infromclient.readLine();
				System.out.println(names[i]);
				if(names[i]=="null")
				break;
			}
			
			for(int i=0;i<n-1;i++)
			{
				String x="";
				for(int j=0;j<n-1;j++)
				{
					if(names[j].compareTo(names[j+1])>0)
					{
					x=names[j];
					names[j]=names[j+1];
				    names[j+1]=x;
				    }
				}
				}
		System.out.println("AfterSort");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(names[i]);
			outtoclient.writeBytes(names[i]+"\n");
			
		}
	}
	
	}
}
