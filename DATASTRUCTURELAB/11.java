import java.io.*;
class Link
{
 public double dData;
 public Link next;

 public Link(double d)
 {
  dData=d;
 }

 public void displayLink()
 {
  System.out.print(dData+" ");
 }
}
 
class FirstLastList
{
 private Link first;
 private Link last;
 
 public FirstLastList()
 {
  first=null;
  last=null;
 }
 
 public boolean isEmpty()
 {
  return first==null;
 }
 
 public void insertLast(double dd)
 {
  Link newLink=new Link(dd);
  if(isEmpty())
   first=newLink;
  else
   last.next=newLink;
  last=newLink;
 }
 
 public double deleteFirst()
 {
  double temp=first.dData;
  if(first.next==null)
   last=null;
  first=first.next;
  return temp;
 }
  
 public void displayList()
 {
  Link current=first;
  while(current!=null)
  {
   current.displayLink();
   current=current.next;
  }
  System.out.println(" ");
 }
}

class LinkQueue
{
 private FirstLastList theList;
 
 public LinkQueue()
 { 
  theList=new FirstLastList();
 }

 public boolean isEmpty()
 {
  return theList.isEmpty();
 }
 
 public void insert(double j)
 {
  theList.insertLast(j);
 }

 public double remove()
 {
   return  theList.deleteFirst();
 }
 
 public void displayQueue()
 {
  System.out.print("Queue(front--->rear):");
  theList.displayList();
 }
}

class LinkQueueApp
{
 public static void main(String args[])throws IOException 
 {
  char c;
  LinkQueue theQueue=new LinkQueue();
  do
  {
   System.out.println("OPERATIONS :\n1.INSERT\n2.REMOVE\n3.DISPLAY\nENTER UR CHOICE : ");
   InputStreamReader obj=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(obj);
   int ch=Integer.parseInt(br.readLine());
   switch(ch)
   {
    case 1:
 	   System.out.println("HOW MANY ELEMENTS :");
                    int n=Integer.parseInt(br.readLine());
	   System.out.println("ENTER THE ELEMENTS :");	
                     
 	   for(int i=0;i<n;i++)
	   { 
 	    double d=Integer.parseInt(br.readLine());
	    theQueue.insert(d);
           }
	   break;
  
    case 2:
           System.out.println("HOW MANY ELEMENTS :");
           int m=Integer.parseInt(br.readLine());
	   for(int i=0;i<m;i++)
	   { 
	    theQueue.remove();
           }
	   break;
 
    case 3:
	   System.out.println("THE ELEMENTS ARE :\n");
	   theQueue.displayQueue();
 	   break;
 
    default:
	    System.out.println("WRONG CHOICE!!!!!");
   }
   System.out.println("DO YOU WANNA CONTINUE ??? (Y/N)");
   c=(char)br.read();
  }while(c=='y'||c=='Y');
 }
}