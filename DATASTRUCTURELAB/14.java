import java.io.*;
class Node
{
 public int rank;
 public int roll;
 public String name;
 public Node leftchild;
 public Node rightchild;
 
 public void Node()
 {
   name=" ";
   rank=0;
   roll=0;
 } 
 
 public void displayRank()
 {
   System.out.println("ROLL No : "+roll+" NAME : "+name+" RANK : "+rank); 
 }
 
 public void displayName()
 { System.out.print("\nNAME OF THE STUDENT IS : "+name); }
}

class Tree
{
 private Node root;
 
 public Tree()
 { root=null; }
 
 public void find(int key)
 {
  Node current=root;
  while(current.rank!=key)
  {
   if(key<current.rank)
    current=current.leftchild;
   else
    current=current.rightchild;
   if(current==null)
    System.out.println("not found");
  }
  current.displayName();
 }

 public void insert(int rno,int r,String a)
 {
  Node newNode=new Node();
  newNode.rank=r;
  newNode.name=a;
  newNode.roll=rno;
  if(root==null)
   root=newNode;
  else
  {
   Node current=root;
   Node parent;
   while(true)
   {
    parent=current;
    if(r<current.rank)
    {
     current=current.leftchild;
     if(current==null)
     {
      parent.leftchild=newNode;
      return; 
     }
    }
    else
    {
     current=current.rightchild;
     if(current==null)
     {
      parent.rightchild=newNode;
      return; 
     }
    }
   }
  }
 }

 public void traverse()
 { inOrder(root); }
 
 private void inOrder(Node localRoot)
 {
  if(localRoot!=null)
  {
   inOrder(localRoot.leftchild);
   localRoot.displayRank();
   inOrder(localRoot.rightchild);
  }
 }
}

class TreeApp
{
public static void main(String args[])throws IOException
{
 
 Tree theTree=new Tree();
 char ch='y';
 int c;
 while(ch=='y'||ch=='Y')
 {
  InputStreamReader isr=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(isr);
  System.out.print("1.INSERT AND ORGANISE THE DATA\n2.GIVEN A RANK DISPLAY THE NAME\n3.DISPLAY RANK IN ASCENDING ORDER\nENTER UR  CHOICE : ");
  c=Integer.parseInt(br.readLine());
  switch(c)
  { 
   case 1:
		System.out.print("\nENTER THE NUMBER OF STUDENTS : ");
		int t=Integer.parseInt(br.readLine());
		
                for(int i=0;i<t;i++)
		{
		 System.out.println("\nENTER ROLL : ");
		 int rno=Integer.parseInt(br.readLine());	
		 System.out.println("\nENTER NAME : ");
		 String a=br.readLine();
		 System.out.println("\nENTER RANK : ");
		 int r=Integer.parseInt(br.readLine());
		
		 theTree.insert(rno,r,a);
		}
		break;
 
   case 2:
		System.out.print("\nENTER THE RANK OF THE STUDENT TO B SEARCHED : ");
		int key=Integer.parseInt(br.readLine());
		theTree.find(key);
		break;

   case 3:
                
  	        System.out.println("RANK LIST IN ASCENDING ORDER IS : ");
		theTree.traverse();
		break;
   
   default:
		System.out.println("\nWRONG CHOICE!!!");
  }
  System.out.print("\nENTER Y TO CONTINUE : ");
  ch=(char)br.read();
 }
}
}	



















 















