import java.io.*;
class Sort
{
 private int[] a;
 private int nElems;
 
 public Sort(int max)
 {
  a=new int[max];
  nElems=0;
 }

 public void insert(int value)
 {
  a[nElems]=value;
  nElems++;
 }

 public void display()
 {
  for(int j=0;j<nElems;j++)
   System.out.print(a[j]+" ");
  System.out.println(" ");
 }

 public void swap(int one,int two)
 {
  int temp=a[one];
  a[one]=a[two];
  a[two]=temp;
 }

 public void bubbleSort()
 {
  int out,in;
  for(out=nElems-1;out>1;out--)
   for(in=0;in<out;in++)
    if(a[in]>a[in+1])
     swap(in,in+1);
 }

 public void selectionSort()
 {
  int out,in,min;
  for(out=0;out<nElems;out++)
  {
   min=out;
   for(in=out+1;in<nElems;in++)
    if(a[in]<a[min])
     min=in;
   swap(out,min);
  }
 }

 public void insertionSort()
 {
  int in,out;
  for(out=1;out<nElems;out++)
  {
   int temp=a[out];
   in=out;
   while(in>0&&a[in-1]>=temp)
   {
    a[in]=a[in-1];
    --in;
   }
   a[in]=temp;
  }
 }


 public void quickSort()
 {
  recQuickSort(0,nElems-1);
 }


 public void recQuickSort(int left,int right)
 {
  if(right-left<=0)
   return;
  else
  {
   int pivot=a[right];
   int partition=partitionIt(left,right,pivot);
   recQuickSort(left,partition-1);
   recQuickSort(partition+1,right);
  }
 }

 public int partitionIt(int left,int right,int pivot)
 {
  int leftPtr=left-1;
  int rightPtr=right;
  while(true)
  {
   while(a[++leftPtr]<pivot)
    ;
   while(rightPtr>0&&a[--rightPtr]>pivot)
    ;
   if(leftPtr>=rightPtr)
      break;
   else
      swap(leftPtr,rightPtr);
  }
  swap(leftPtr,right); 
  return(leftPtr);
 }
}


class SortApp
{
 public static void main(String args[])throws IOException
 {
  char ch='y';
  int maxsize=100;
  Sort s=new Sort(maxsize);
  InputStreamReader obj=new InputStreamReader(System.in);
  BufferedReader BR=new BufferedReader(obj);
  System.out.println("ENTER THE NUMBER OF ELEMENTS : ");
  int m=Integer.parseInt(BR.readLine());
  System.out.println("ENTER THE ELEMENTS : ");
  for(int i=0;i<m;i++)
  {
    int d=Integer.parseInt(BR.readLine());
    s.insert(d);
  } 
   
  while(ch=='y'||ch=='Y')
  {
   InputStreamReader isr=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(isr);
   System.out.println("SORTING :-\n1.QUICK\n2.SELECTION\n3.INSERTION\n4.BUBBLE\nENTER UR CHOICE : ");
   int n=Integer.parseInt(br.readLine());
   switch(n)
   {
    case 1:
	s.quickSort();
        System.out.println("THE ARRAY AFTER SORTING USING QUICK SORT IS : ");
        s.display();
	break;
    case 2:
	s.selectionSort();
	System.out.println("THE ARRAY AFTER SORTING USING SELECTION SORT IS : ");
        s.display();
	break;
    case 3:
	s.insertionSort();
	System.out.println("THE ARRAY AFTER SORTING USING INSERTION SORT IS : ");
        s.display();
	break;
    case 4:
	s.bubbleSort();
	System.out.println("THE ARRAY AFTER SORTING USING BUBBLE SORT IS : ");
        s.display();
	break;
    default:
	System.out.println("WRONG CHOICE!!!"); 
   }
   System.out.print("ENTER Y TO CONTINUE : ");
   ch=(char)br.read();
  }
 }
}








 





































