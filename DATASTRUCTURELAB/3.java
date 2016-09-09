import java.lang.*;
import java.io.*;
import java.util.*;
class Fib1 {
public static void main (String args[]){
Scanner input = new Scanner(System.in);
int i,a=0,b=1,c=0,t;
System.out.print("Enter the value of t:");
t= input.nextInt();
System.out.println(a);
System.out.println(b);
for(i=0;i<t-2;i++)
{
c=a+b;
a=b;
b=c;
System.out.println(c);
}
System.out.println();
System.out.print(t + "the value of the series is:" + c);
}
}