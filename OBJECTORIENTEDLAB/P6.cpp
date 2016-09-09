#include<iostream>
using namespace std;
class comp
{
	float x,y;
	public:
	comp ()
	{
	x=0;y=0;	
	}
	
		comp (float a,float b)
		{
			x=a;
			y=b;
		}
		friend void sum(float,comp);
		friend void sum(comp,comp);
};
	void sum(float s,comp c5)
	{
		comp c6;
		c6.x=s+c5.x;
		c6.y=c5.y;
		cout<<"sum="<< c6.x <<"+"<<c6.y<<"j\n";
	}
	void sum(comp c2,comp c4)
		{
		comp c3;
		c3.x=c2.x+c4.x;
		c3.y=c2.y+c4.y;
		cout <<"sum ="<< c3.x <<"+"<<c3.y<<"j\n";
	}
	
int main()
{
	comp a(-2.7,-3.5);
	comp b(-1.6,-1.6);
	sum (a,b);
	sum (10.1,a);
	return(0);
}