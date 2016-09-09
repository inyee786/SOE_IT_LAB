#include<iostream>
#include<math.h>
using namespace std;

void area(float,float,float);
void area(float,float);
void area(float);
void area(int);

void area(float a,float b,float c)
{
	double q=0,s=0;
	s=(a+b+c)/2;
	q=sqrt(s*(s-a)*(s-b)*(s-c));
	cout<<"Area of the Triangle="<<q;
}

void area(float a,float b)
{
	float q=0;
	q=a*b;
	cout<<"Area of the Rectangle="<<q;
}

void area(float a)
{
	float q=0;
	q=a*a;
	cout<<"Area of the Square="<<q;	
}

void area(int a)
{
	float q=0;
	q=3.14*a*a;
	cout<<"Area of the Circle="<<q;
}

main()
{
	char op='y';
	int opt,r;
	float a,b,c;
	do
	{
		cout<<"Select an option\n1.Triangle\n2.Rectangle\n3.Square\n4.Circle\n";
		cin>>opt;
		switch(opt)
		{
			case 1:
				cout<<"Enter the sides of the Triangle\n";
				cout<<"a=";
				cin>>a;
				cout<<"b=";
				cin>>b;
				cout<<"c=";
				cin>>c;
				area(a,b,c);
				break;
				
			case 2:
				cout<<"Enter the sides of the Rectangle\n";
				cout<<"l=";
				cin>>a;
				cout<<"b=";
				cin>>b;
				area(a,b);
				break;
				
			case 3:
				cout<<"Enter the side of the Square\n";
				cout<<"a=";
				cin>>a;
				area(a);
				break;
				
			case 4:
				cout<<"Enter the radius of the circle\n";
				cout<<"r=";
				cin>>r;
				area(r);
				break;
				
			default:
				cout<<"Invalid option";
				break;
		}
		cout<<"\nDo you want to continue(y/n)";
		cin>>op;
	}while(op=='y');
return 0;
}