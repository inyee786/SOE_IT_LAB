import java.io.*;
class Occurrence
{
 public static void main(String args[])throws IOException
{
 BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
 String st;
 System.out.println("enter the string");
 st=buf.readLine();
 int i,j,l;
 l=st.length();
 System.out.println("enter the character to remove");
 char ch=(char)buf.read();
 for(i=0;i<l;i++)
 {
  if(st.charAt(i)!=ch)
  {
   System.out.print(st.charAt(i));
  }
 }
}
}