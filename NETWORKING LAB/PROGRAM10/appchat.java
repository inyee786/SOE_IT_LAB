
import java.io.*;
import java.net.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;

import javax.swing.*;

interface writable
{
	void write(String s);
}
class MessageListener extends Thread 
{
int port=6789;
ServerSocket server;
writable gui;
public MessageListener()
{
	try
	{
		server=new ServerSocket(port);
	}
	catch(Exception e)
	{
		System.out.println("error "+e);
	}
}
public MessageListener(writable gui,int port)
    {
	this.gui=gui;
	this.port=port;
	try
	{
		server=new ServerSocket(port);
	}
	catch(Exception e)
	{
		System.out.println("error "+e);
	}
	}
@Override
public void run()
{
 Socket clientsocket;
 try
 {
	 while((clientsocket=server.accept())!=null)
	 {
		 BufferedReader in=new BufferedReader(new InputStreamReader(clientsocket.getInputStream()));
		 String line=in.readLine();
		 if(line!=null)
			 gui.write(line);
	 }
 }
 catch(Exception e)
 {
	 System.out.println("error"+e);
 }
}
}

class MessageTransmitter extends Thread
{
	String message,hostname;
	int port;
	public MessageTransmitter(String message,String hostname,int port)
	{
		this.port=port;
		this.hostname=hostname;
		this.message=message;
	}
	public void run()
	{
		try
		{
			Socket s=new Socket(hostname,port);
			s.getOutputStream().write(message.getBytes());
			s.close();
		}
		catch(Exception e)
		{
			System.out.print("error "+e);
		}
	}
}

public class appchat extends JFrame implements writable
{
static MessageListener Listen;
static MessageTransmitter transmit;
static JTextField rport,hostname,tport,message;
static JLabel rlabel,hlabel,tlabel,mlabel;
static JButton connect,send;
static JTextArea area;

public static void main(String args[])
{
JFrame frame=new JFrame();
final writable gui=new appchat();
frame.setLayout(new FlowLayout());
rlabel=new JLabel("Receiving Port Number");
frame.add(rlabel);
rport=new JTextField(20);
frame.add(rport);
hlabel=new JLabel("Enter Hostname");
frame.add(hlabel);
hostname=new JTextField(20);
frame.add(hostname);
tlabel=new JLabel("Enter Target Port");
frame.add(tlabel);
tport=new JTextField(20);
frame.add(tport);
connect=new JButton("Listen");
frame.add(connect);
connect.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
Listen=new MessageListener(gui,Integer.parseInt(rport.getText()));
Listen.start();
}
});
area=new JTextArea(10,70);
frame.add(area);
mlabel=new JLabel("Write Message");
frame.add(mlabel);
	//p[ppp[ppppop[poppopo0opo-0o00oopopoopooooooggggy6jkjjkjj98u8uuhhhhhhhhuyu7uiu ]]];
message=new JTextField(70);
frame.add(message);
send=new JButton("send");
frame.add(send);
send.addActionListener(new ActionListener()
{
public void actionPerformed(ActionEvent e)
{
transmit=new MessageTransmitter(message.getText(),hostname.getText(),Integer.parseInt(tport.getText()));
transmit.start();
area.append("You:"+message.getText()+"\n");
message.setText("");
}
});
frame.setSize(800,800);
frame.setVisible(true);
}
@Override
public void write(String s)
{
	area.append("From Target:"+s+"\n");
}
}