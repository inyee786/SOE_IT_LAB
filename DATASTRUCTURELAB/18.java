import java.io.*;
class OrdArray
{
 private int[] a;
 private int nElems;
 public OrdArray(int max)
 {
  a=new int[max];
  nElems=0;
 }
 
 public int size()
 { return nElems; }
  
 public int find(int searchkey)
 {
  int lb=0,ub=nElems-1,curIn;
  while(true)
  {
   curIn=(lb+ub)/2;
   if(a[curIn]==searchkey)
    return curIn;
   else if(lb>ub)
    return nElems;
   else 
   {
    if(a[curIn]<searchkey)
     lb=curIn+1;
    else 
     ub=curIn-1;
   }
  }
 }

 public void insert(int value)
 {
  int j;
  for(j=0;j<nElems;j++) 
   if(a[j]>value)
     break;
   for(int k=nElems;k>j;k--)
    a[k]=a[k-1];
  a[j]=value;
  nElems++;
 }

 public void display()
 { 
  
  for(int j=0;j<nElems;j++)
   System.out.print(a[j]+" ");
  System.out.println(" ");
 }
}
 

class OrderedApp
{
 public static void main(String[] args)throws IOException
 {
  InputStreamReader obj=new InputStreamReader(System.in);
  BufferedReader br=new BufferedReader(obj);
  int maxSize=100,n,searchkey;
  OrdArray arr;
  arr=new OrdArray(maxSize);
  
  

  System.out.println("ENTER THE  LIMIT OF THE ARRAY: ");
  n=Integer.parseInt(br.readLine());

  int b[]=new int[n];

  System.out.println("ENTER THE ARRAY ELEMENTS : ");
 
  
  for(int i=0;i<n;i++)
  {
   b[i]=Integer.parseInt(br.readLine());
   arr.insert(b[i]);
  }

   arr.display();
 
  System.out.println("ENTER THE  ELEMENT TO BE SEARCHED : ");
  searchkey=Integer.parseInt(br.readLine());


  if(arr.find(searchkey)!=arr.size())
   System.out.println("FOUND"+searchkey);
  else
   System.out.println("CAN'T FIND"+searchkey);
 
 }
} 

























