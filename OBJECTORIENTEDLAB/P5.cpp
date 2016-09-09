#include<iostream>
using namespace std;

class CLOCK
{
	int h,m,s;
	
	public:
	CLOCK()
	{
		h=m=s=0;
	}
	void input();	
	friend void add(CLOCK,CLOCK);
};

void CLOCK::input()
{
	cout<<"Enter the time\n";
	cout<<"h=";
	cin>>h;
	cout<<"m=";
	cin>>m;
	cout<<"s=";
	cin>>s;
}

void add (CLOCK c1, CLOCK c2)
{
	CLOCK c3;
	c3.s=c1.s+c2.s;
	if(c3.s>=60)
	{
		c3.s=c3.s-60;
		c3.m++;
	}	
	c3.m=c3.m+c1.m+c2.m;
	
	if(c3.m>=60)
	{
		c3.m=c3.m-60;
		c3.h++;
	}
	c3.h=c3.h+c1.h+c2.h;
	cout<<"\nh="<<c3.h<<"\nm="<<c3.m<<"\ns="<<c3.s<<"\n";
	

}

main()
{
	CLOCK c1,c2,c3;
	c1.input();
	c2.input();
	add(c1,c2);
	return 0;
}




