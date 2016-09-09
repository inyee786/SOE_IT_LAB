import java.io.*;
class Link
{
 public int data;

 public Link next;
 public Link previous;
 
 public Link(int d)
 {
  data=d; 
 
 }
 
 public void displayLink()
 { System.out.print(data+" "); }
 
}

class DoublyLinkedList
{
 private Link first;
 private Link last;

 public DoublyLinkedList()
 {
  first=null;
  last=null;
 }
 
 public boolean isEmpty()
 { return first==null; }
 


 public void insertLast(int dd)
 {
  Link newLink=new Link(dd);
  if(isEmpty())
   first=newLink;
  else
  {
   last.next=newLink;
   newLink.previous=last;
  }
  last=newLink;

 }

 
 public boolean insertAfter(int d,int pos)
 {
  int p=0;
  Link current=first;
  while(p!=(pos-1))
  {
   current=current.next;
   p++;
   if(current==null)
    return false;
  }
  Link newLink=new Link(d);
  if(current==last)
  {
   newLink.next=null;
   last=newLink;
  }
  else
  {
   newLink.next=current.next;
   current.next.previous=newLink;
  }
  newLink.previous=current;
  current.next=newLink;
  
  return true;
 }

 public Link deletekey(int key)
 {
  Link current=first;
  while(current.data!=key)
  {
   current=current.next;
   if(current==null)
    return null;
  }
  if(current==first)
   first=current.next;
  else
   current.previous.next=current.next;
  if(current==last)
   last=current.previous;
  else
    current.next.previous=current.previous;
 
  return current;
  
 }

 public void concatenate(DoublyLinkedList theList2)
 {
  Link current=theList2.first;
  while(current!=null)
  {
   Link newLink=new Link(current.data);
   last.next=newLink;
   newLink.previous=last;
   last=newLink;
   current=current.next;
  }
 }

 public void displayForward()
 {
  System.out.print("List(first-->last):");
  Link current=first;
  while(current!=null)
  {
   current.displayLink();
   current=current.next;
  }
  System.out.println(" ");
 }

 public void displayBackward()
 {
  System.out.print("List(last-->first):");
  Link current=last;
  while(current!=null)
  {
   current.displayLink();
   current=current.previous;
  }
  System.out.println(" ");
 }
}


class DoublyLinkedApp
{
 public static void main(String[] args)throws IOException
 {
  InputStreamReader obj=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(obj);
  
  int d,dd;
  int pos;
  char c='Y';
  
  DoublyLinkedList theList1=new DoublyLinkedList();

  System.out.print("ENTER THE No. OF ELEMENTS : ");
  int n=Integer.parseInt(br.readLine());

  System.out.println("ENTER  ELEMENTS : ");
  for(int i=0;i<n;i++)
  {
    dd=Integer.parseInt(br.readLine()); 
    theList1.insertLast(dd);
  }

  while(c=='y'||c=='Y')
  {
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader BR=new BufferedReader(isr);


   System.out.print("OPERATIONS : \n1.INSERTION AT Nth POSITION\n2.CONCATENATE TWO DOUBLY LINKED  LIST\n3.DELETE NtH ELEMENT\n4.DISPLAY\nENTER UR CHOICE : ");
   int ch=Integer.parseInt(BR.readLine());
   switch(ch)
   {
    case 1:
	System.out.println("ENTER THE ELEMENT TO BE INSERTED AND ITS POSITION : ");
        d=Integer.parseInt(BR.readLine());
        pos=Integer.parseInt(BR.readLine());
        theList1.insertAfter(d,pos);
        break;
    case 2:
	 DoublyLinkedList theList2=new DoublyLinkedList();
	 System.out.print("ENTER THE No. OF ELEMENTS : ");
         int m=Integer.parseInt(br.readLine());

         System.out.println("ENTER  ELEMENTS OF LIST TO BE CONCATENATED : ");
         for(int i=0;i<m;i++)
         {
          d=Integer.parseInt(br.readLine()); 
          theList2.insertLast(d);
         }
	 theList1.concatenate(theList2);
	 break;

    case 3:
        System.out.println("ENTER THE ELEMENT TO BE DELETED : ");
        d=Integer.parseInt(BR.readLine());
	theList1.deletekey(d);      
        break;
    case 4:
	System.out.println("DISPLAY FORWARD : ");
        theList1.displayForward();
        System.out.println("DISPLAY BACKWARD : ");
        theList1.displayBackward();
        break;
    default:
        System.out.println("WRONG CHOICE!!!!!");
   }
   System.out.print("ENTER Y TO CONTINUE : ");	   
   c=(char)BR.read();  
  }
 }
}







 








  







