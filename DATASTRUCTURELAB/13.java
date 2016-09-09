import java.io.*;
class Node
{
 public int data;
 public Node next;
 public Node previous;
 
 public Node(int x)
 { data=x; }
 
 public void displayNode()
 { System.out.print(data+" "); }
}

class DoublyLinkList
{
 private Node first;
 private Node last;
  
 public DoublyLinkList()
 {
  first=null;
  last=null;
 }
 
 public void insertFirst(int  x)
 {
  Node newNode=new Node(x);
  newNode.next=null;
  if(isEmpty())
   last=newNode;
  else
  {
   first.previous=newNode;
   newNode.next=first; 
  } 
  first=newNode;
 }

 public void insertLast(int x)
 {
  Node newNode=new Node(x);
  newNode.next=null;
  if(isEmpty())
   first=newNode;
  else
  {
   last.next=newNode; 
   newNode.previous=last;
  }
  last=newNode;
 }
 
 public int deleteFirst()
 { 
  int t=first.data;
  if(first.next==null)
   last=null;
  else
   first.next.previous=null;
  first=first.next;
  return t;
 }
 
 public int deleteLast()
 { 
  int t=last.data;
  if(first.next==null)
   first=null;
  else
   last.previous.next=null;
  last=last.previous;
  return t;
 }
  
 public boolean isEmpty()
 { return(first==null); }
  
 public void displayForward()
 {
  Node current=first;
  while(current!=null)
  {
   current.displayNode();
   current=current.next;
  }
 }

 public void displayBackward()
 {
  Node current=last;
  while(current!=null)
  {
   current.displayNode();
   current=current.previous;
  }
 } 
}

class Deque
{
 private DoublyLinkList l;
 
 public Deque()
 {
  l=new DoublyLinkList();
 }

 public void insertLeft(int x)
 {
  l.insertFirst(x);
  System.out.print("Inserted to Front");
 }
 
 public void insertRight(int x)
 {
  l.insertLast(x);
  System.out.print("Inserted into Rear");
 }
 
 public int  deleteLeft()
 { return l.deleteFirst(); }
 
 public int deleteRight()
 { return l.deleteLast(); }
 
 public boolean isQueueEmpty()
 { return l.isEmpty(); }
 
 public void displayFromFront()
 { l.displayForward(); }

 public void displayFromRear()
 { l.displayBackward(); }
}
 
class DequeApp
{
 public static void main(String args[])throws IOException
 {
  Deque q=new Deque();
  char ch='y';
  int n,d;
  while(ch=='y'||ch=='Y')
  {
   InputStreamReader obj=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(obj);
   System.out.println("MENU : \n1.INSERT AT FRONT\n2.INSERT AT REAR\n3.DELETE AT FRONT\n4.DELETE AT REAR\n5.DISPLAY FROM FRONT\n6.DISPLAY FROM REAR\nENTER UR CHOICE : ");
   n=Integer.parseInt(br.readLine());
   switch(n)
   {
    case 1:
		System.out.println("ENTER THE DATA :");
		d=Integer.parseInt(br.readLine());
		q.insertLeft(d);
		break;
    case 2:
		System.out.println("ENTER THE DATA : ");
		d=Integer.parseInt(br.readLine());
		q.insertRight(d);
		break;
    case 3:
		if(q.isQueueEmpty())
		 System.out.print("DEQUE US EMPTY");
		else
		{
		 d=q.deleteLeft();
		 System.out.print("DELETED DATA "+d);
	  	} 
		break;
    case 4:
		if(q.isQueueEmpty())
		 System.out.print("DEQUE IS EMPTY");
		else
		{
		 d=q.deleteRight();
		 System.out.print("DELETED DATA "+d);
	  	} 
		break;
   
   case 5:
		if(q.isQueueEmpty())
		 System.out.print("DEQUE IS EMPTY " );
		else
		{
		 System.out.print("DATAS IN DEQUE FROM FRONT :- ");
		 q.displayFromFront();
		}
		break;
    case 6:
		if(q.isQueueEmpty())
		 System.out.print("DEQUE IS EMPTY " );
		else
		{
		 System.out.print("DATAS IN DEQUE FROM REAR :- ");
		 q.displayFromRear();
		}
		break;
    default:
		System.out.print("INVALID CHOICE ");
   }
   System.out.println(" ");
   System.out.print("ENTER Y TO CONTINUE : ");
   ch=(char)br.read();
  }
 }
}



















































































