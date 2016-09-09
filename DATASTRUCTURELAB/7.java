import java.io.*;
class Sparse
{
public static void main(String args[])throws IOException
{
int m,n,i,j,t=0;
InputStreamReader obj=new InputStreamReader(System.in);
BufferedReader br=new BufferedReader(obj);
System.out.println("enter the order of matrix");
m=Integer.parseInt(br.readLine());
n=Integer.parseInt(br.readLine());
int a[][]=new int[m][n];
System.out.println("enter the matrix elements:");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
a[i][j]=Integer.parseInt(br.readLine());
System.out.println("sparse matrix representation");
for(i=0;i<m;i++)
for(j=0;j<n;j++)
if(a[i][j]>0)
t++;
System.out.println(m+" "+n+" "+t);
for(i=0;i<m;i++)
for(j=0;j<n;j++)
if(a[i][j]>0)
System.out.println(i+" "+j+" "+a[i][j]);
System.out.println("tranporse of matrix");
System.out.println(n+" "+m+" "+t);
for(i=0;i<n;i++)
for(j=0;j<m;j++)
if(a[j][i]>0)
System.out.println(i+" "+j+" "+a[j][i]);
}
}