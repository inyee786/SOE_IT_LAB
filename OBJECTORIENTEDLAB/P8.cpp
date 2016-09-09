#include<iostream>
using namespace std;

class dist
{
	float ft,in;
	
	public:
	dist();
	void input();
	void disp();
	friend dist operator+(dist,dist);
	friend int operator<(dist,dist);
};

dist::dist()
{
	ft=in=0.0;
}

void dist::input()
{
	cout<<"Enter the distance\n";
	cout<<"feet:";
	cin>>ft;
	cout<<"inch:";
	cin>>in;
}

void dist::disp()
{
	cout<<"\nfeet:"<<ft;
	cout<<"\ninch:"<<in<<"\n";
}

dist operator+(dist d1,dist d2)
{
	dist d;
	d.ft=d1.ft+d2.ft;
	d.in=d1.in+d2.in;
	while(d.in>=12.0)
	{
		d.ft++;
		d.in=d.in-12.0;	
	}
	return d;	
}

int operator<(dist d1,dist d2)
{
	float a,b;
	a=d1.ft+((d1.in/12.0));
	b=d2.ft+((d2.in/12.0));
	
	if(a<b)
	return 1;
	
	else
	return 0;
}

main()
{
	dist d1,d2,d3;
	d1.input();
	d2.input();
	d3=d1+d2;
	cout<<"Sum:\n";
	d3.disp();
	cout<<"\nSmallest:\n";
	if(d1<d2)
	d1.disp();
	
	else 
	d2.disp();
	
	return 0;
}

