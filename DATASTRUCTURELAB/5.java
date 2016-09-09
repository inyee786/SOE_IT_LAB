import java.util.Scanner;
class Factorial{
public static void main(String args[])
{
int num,fact=1;
Scanner input = new Scanner(System.in);
System.out.println("Enter the limit below 16");
num = input.nextInt();
for(int i=1;i<=num;i++)
{
fact=fact*i;
System.out.print("Factorial"+ "  " + i + " is " + fact + "\n");
}
}
}

