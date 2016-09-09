#include<iostream>
using namespace std;

struct dob
{
	int d,m,y;
};

class person
{
	protected:
		char name[50];
		int age;
};

class account:virtual public person
{
	protected:
		float acno;	
};

class admin:virtual public person
{
	protected:
			dob dd;
};

class master:public account,admin
{
	public:
		void input();
		void display();
		int update(float,int);
}m[10];

void master::input()
{
	cout<<"Enter the name:"; 
	cin>>name;
	
	cout<<"Enter the age:"; 
	cin>>age;
	
	cout<<"Enter the account number:"; 
	cin>>acno;
	
	cout<<"Enter your date of birth\nd:"; 
	cin>>dd.d;
	
	cout<<"m:"; 
	cin>>dd.m;
	
	cout<<"y:";
 	cin>>dd.y;
}

void master::display()
{
	cout<<name;
	cout<<"\t"<<age;
	cout<<"\t"<<acno;
	cout<<"\t"<<dd.d<<"/"<<dd.m<<"/"<<dd.y<<"\n";
}

int master::update(float ac,int size)
{
	int pos=0;
	
	for(int i=0;i<size;i++)
	{
		if(m[i].acno==ac)
		{
			pos=i;
			break;
		}
		else 
			pos=-1;
	}
	return pos;		
}

void tabb()
{
	cout<<"\nName\tage\taccno\tDOB\n";
	cout<<"____\t___\t_____\t___\n";
}

main()
{
	int s=0,i,opt,p;
	char loop='y';
	float acc;
	master u;
	while(loop=='y'||loop=='Y')
	{
		cout<<"1.Input\n2.Display\n3.Update\nOption:";
		cin>>opt;
		
		switch(opt)
		{
			case 1:
				cout<<"Enter the total number of inputs:";
				cin>>s;
				cout<<"Enter the details...\n";
					for(i=0;i<s;i++)
						m[i].input();
				break;
					
			case 2:
				tabb();
				for(i=0;i<s;i++)
					m[i].display();	
				break;
				
			case 3:
				cout<<"Enter the accno:";
				cin>>acc;
				p=u.update(acc,s);
				if(p!=-1)
				{
					cout<<"\nEnter the new details\n";
					m[p].input();
				}
				else	
					cout<<"\n...Invalid...\n";
				break;
				
			default:
				cout<<"...Invalid Option...\n";
				break;			
		}		
		cout<<"\nDo you want to continue(y/n):";
		cin>>loop;
	}
return 0;
}