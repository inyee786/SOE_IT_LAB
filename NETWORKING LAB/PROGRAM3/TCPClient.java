import java.io.*;
import java.net.*;

class TCPClient
{
public static void main(String args[])throws IOException
{
String sentence;
String modifiedsentence;
while(true)
{
BufferedReader infromuser = new BufferedReader(new InputStreamReader(System.in));
Socket Clientsocket = new Socket("localhost",8080);
DataOutputStream Outtoserver = new DataOutputStream(Clientsocket.getOutputStream());
BufferedReader informserver = new BufferedReader(new InputStreamReader(Clientsocket.getInputStream()));
sentence = infromuser.readLine();
Outtoserver.writeBytes(sentence+"\n");
modifiedsentence=informserver.readLine();
System.out.println("From server :"+modifiedsentence);
}}
}