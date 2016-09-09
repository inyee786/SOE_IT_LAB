#include<iostream>
#include<math.h>
using namespace std;
class Rec
{
	private:
	double xco;
	double yco;
	public:
	Rec()
	{
		xco=0.0;yco=0.0;
	}
	Rec(double x,double y)
	{
		xco=x;yco=y;
	}
	void display()
	{
		cout<<"("<<xco<<","<<yco<<")";
	}
};
class polar
{
	private:
	double radius;
	double angle;
	public:
	polar()
	{
		radius=0.0;angle=0.0;
	}
	polar(double r,double a)
	{
		radius=r;angle=a;
	}
	void display()
	{
		cout<<"("<<radius<<","<<angle<<")";
	}
	operator Rec()
	{
		double x=radius*cos(angle);
		double y=radius*sin(angle);
		return Rec(x,y);
	}
};
main()
{
	Rec rec;
	polar pol(10.0,0.785398);
	rec=Rec(pol);
	cout<<"\n polar=";pol.display();
	cout<<"\n rectangular=";rec.display();
}



