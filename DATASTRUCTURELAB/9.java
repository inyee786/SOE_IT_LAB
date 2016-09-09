import java.io.*;

class StackX
{
 private int maxSize;
 private double[] stackArray;
 private int top;

 public StackX(int s)
 {
  maxSize=s;
  stackArray= new double[maxSize];
  top=-1;
 }

 public void push(double j)
 {
  stackArray[++top]=j;
 }

 public double pop()
 {
  return stackArray[top--];
 }

 public double peek()
 {
  return stackArray[top];
 }
  
  public void showStack()
 {
  for(int i=top;i>=0;i--)
   System.out.println((stackArray[i]));
 }

 public boolean isEmpty()
 {
  if(top==-1)
   return true;
  else
   return false;
 }
}
 


class StackApp
{
 public static void main(String[] args)throws IOException
 {
  char c;
  StackX a=new StackX(10);
  do
  {
  InputStreamReader obj=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(obj);

  
  
  System.out.println("STACK OPERATIONS : \n1.PUSH\n2.POP\n3.DISPLAY\nENTER UR CHOICE");
  int ch=Integer.parseInt(br.readLine());
  
  switch(ch)
  {
   case 1:
	   System.out.println("HOW MANY ELEMENTS :");
           
           int n=Integer.parseInt(br.readLine());

	   System.out.println("THE ELEMENTS ARE:");
 	   for(int i=0;i<n;i++)
	   { 
             int d=Integer.parseInt(br.readLine());
	     a.push(d);
	   }
           System.out.println("CURRENT STACK TOP:-"+a.peek());
	   break;

   case 2:
           System.out.println("HOW MANY ELEMENTS :");
           int m=Integer.parseInt(br.readLine());
 	   for(int i=0;i<m;i++)
	   { 
             a.pop();
	   }
           System.out.println("CURRENT STACK TOP:-"+a.peek());
	   break;

   case 3:
           System.out.println("THE ELEMENTS ARE :");
           a.showStack();
           break;
   default:
           System.out.println("WRONG CHOICE!!!!!");
  }
   System.out.println("DO YOU WANNA CONTINUE ??? (Y/N)");
   c=(char)br.read();
  }while(c=='y'||c=='Y');
 }
}


    
    


