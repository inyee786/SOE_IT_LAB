#include<iostream.h>

class DATA
{
	int d[20];
	static int c;
	public:
	void input(int n);
	void disp();
	
};
int DATA::c;

void DATA::input(int n)
{
	cout<<"enter the array elements\n";
	for(int i=0;i<n;i++)
	{
		cin>>d[i];
		if(d[i]>0)
		{
			c++;
			
		}
		
	}
}

	void DATA::disp()
	
		
	{
		cout<<"no of positive terms="<<c<<"\n";
	}
	
main()
{
DATA d1,d2;
	int n;
	cout<<"enter the size of the array:";
	cin>>n;
	d1.input(n);
	d2.input(n);
	d1.disp();
	return 0;
	
	
}