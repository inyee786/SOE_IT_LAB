#include<iostream>
using namespace std;
class CLOCK
{
	int h,m,s;
	public:
	CLOCK();
	CLOCK(int a,int b,int c);
	void disp();
};
CLOCK::CLOCK()
{
	h=m=s=0;
}
CLOCK::CLOCK(int a,int b,int c)
{
	h=a;
	m=b;
	s=c;
}
void CLOCK::disp()
{
	cout<<"\n h="<<h<<"\n m="<<m<<"\n s=";
	cout<<s<<"\n";
}
int main()
{
	CLOCK C1=CLOCK();
	CLOCK C2=CLOCK(2,45,56);
	C1.disp();
	C2.disp();
	return 0;
}
