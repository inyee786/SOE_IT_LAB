package javaapplication48;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
 class Polynomial
{
private int degree;
private Node head;
public static Polynomial addPolys(Polynomial poly1, Polynomial poly2)
{
Polynomial polyRes = new Polynomial();
int power = (poly1.degree > poly2.degree) ? poly1.degree : poly2.degree;
while (power >= 0)
{
Node n1 = poly1.head;
while (n1 != null)
{
if (n1.power == power)
break;
n1 = n1.next;
}
Node n2 = poly2.head;
while (n2 != null)
{
if (n2.power == power)
break;
n2 = n2.next;
}
if ((n1 != null) && (n2 != null))
polyRes.addNode(n1.coeff + n2.coeff, n1.power);
else if (n1 != null)
polyRes.addNode(n1.coeff, n1.power);
else if (n2 != null)
polyRes.addNode(n2.coeff, n2.power);
power--;
}
return polyRes;
}
public void addNode(int coeff, int power)
{
if (head == null) // start the list
{
head = new Node(coeff, power, null);
degree = power;
}
else
{
Node n = head;
Node last = null;
while (n != null)
{
if (power > n.power) // insert in list
{
if (last == null)
head = new Node(coeff, power, n);
else
last.next = new Node(coeff, power, n);
degree = power;
break;
}
last = n;
n = n.next;
}
if (n == null) // append to list
{
last.next = new Node(coeff, power, null);
}
}
}
public String toString()
{
StringBuffer strBuf = new StringBuffer();
Node n = head;
while (n != null)
{
strBuf.append(n.coeff).append(" ").append(n.power).append(" ");
n = n.next;
}
return strBuf.toString();
}
public class Node
{
public int coeff;
public int power;
public Node next;
public Node(int coeff, int power, Node next)
{
this.coeff = coeff;
this.power = power;
this.next = next;
}
}
}
class PolyTest
{
public static void main(String[] args)
throws Exception
{
System.out.println("Enter the values:");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String line = br.readLine();
int pos = line.indexOf('+');
if (pos == -1)
{
System.out.println("Must have an addition sign");
return;
}
String polyStr1 = line.substring(0, pos).trim();
Polynomial poly1 = parsePolynomial(polyStr1);
String polyStr2 = line.substring(pos + 1).trim();
Polynomial poly2 = parsePolynomial(polyStr2);
Polynomial poly3 = Polynomial.addPolys(poly1, poly2);
System.out.println();
System.out.println("Result:");
System.out.println(poly3);
}
static Polynomial parsePolynomial(String polyStr)
{
Polynomial poly = new Polynomial();
StringTokenizer strTok = new StringTokenizer(polyStr);
while (strTok.hasMoreTokens())
{
int coeff = Integer.parseInt(strTok.nextToken());
int power = Integer.parseInt(strTok.nextToken());
poly.addNode(coeff, power);
}
return poly;
}
}
