#include<iostream>
#include<math.h>
using namespace std;
class polygon /*abstract class*/
{
	public:
	virtual float area()=0;
	virtual float perimeter()=0;
	virtual void getdata()=0;
};
class triangle:public polygon
{
	protected:
	float a,b,c,s,ar;
	public:
	void getdata()/*note this function is not virtual*/
	{
		cout<<"enter the sides of triangle";
		cin>>a>>b>>c;
	}
float area()
{
s=(a+b+c)/2.0;
ar=sqrt(s*(s-a)*(s-b)*(s-c));
return ar;
}
float perimeter()
{
return(a+b+c);
}
};
class rectangle:public polygon
{
	protected:
	float a,b;
	public:
	void getdata()
	{
		cout<<"enter the sides of rectangle";
		cin>>a>>b;
	}
	float area()
	{
		
	return(a*b);
	}
float perimeter()
{
	return(2.0*(a+b));
}
};
class square:public polygon
{
	protected:
	float a;
	public:
	void getdata()
	{
		cout<<"enter the sde of square";
		cin>>a;
	}
	float area()
	{
		return(a*a);
	}
	float perimeter()
	{
		return(4.0*a);
	}
};
int main()
{
	triangle t;
	rectangle r;
	square s;
	polygon *ptr[5];
	ptr[0]=&t;
	ptr[1]=&r;
	ptr[2]=&s;
	for(int i=0;i<3;i++)
	{
		ptr[i]->getdata();
		cout<<"\narea="<<ptr[i]->area();
		cout<<"\n";
		cout<<"perimeter="<<ptr[i]->perimeter();
		cout<<"\n";
	}
	return 0;
}
