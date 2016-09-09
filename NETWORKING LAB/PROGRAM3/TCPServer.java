import java.io.*;
import java.net.*;
class TCPServer
{
public static void main(String args[])throws IOException
{
String clientsentence;
String capitalsentence;
ServerSocket welcomesocket= new ServerSocket(8080);
while(true)
{
Socket connectionsocket = welcomesocket.accept();
BufferedReader infromclient =new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
DataOutputStream Outtoclient = new DataOutputStream(connectionsocket.getOutputStream());
clientsentence=infromclient.readLine();
capitalsentence=clientsentence.toUpperCase();
System.out.println(capitalsentence);
Outtoclient.writeBytes(capitalsentence+"\n");
}
}}
