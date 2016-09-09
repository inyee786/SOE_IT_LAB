#include<iostream>
using namespace std;
struct dob
{
	int d,m,y;	
};

class student
{
	protected:
		char name[50];
		dob dd;
		int rno;
	
	public:
		virtual void getdata()=0;
		virtual void displayresult()=0;	
					
};

class pg:public student
{
	public:
		void getdata()
		{
			cout<<"Enter the data of PG student\n";
			cout<<"Enter the name:"; cin>>name;
			
			cout<<"Enter the date of birth:\nd="; cin>>dd.d;
			cout<<"m="; cin>>dd.m;
			cout<<"y="; cin>>dd.y;
			
			cout<<"Enter the roll number:"; cin>>rno;
		}	
		
		void displayresult()
		{
			cout<<"\nData of PG student\n";
			cout<<"..................\n";
			
			cout<<"Name:"<<name;
			cout<<"\nDate of birth:"<<dd.d<<"/"<<dd.m<<"/"<<dd.y;
			cout<<"\nRoll Number:"<<rno<<"\n";
		}	
};

class ug:public student
{
	public:
		void getdata()
		{
			cout<<"Enter the data of UG student\n";
			cout<<"Enter the name:"; cin>>name;
			
			cout<<"Enter the date of birth:\nd="; cin>>dd.d;
			cout<<"m="; cin>>dd.m;
			cout<<"y="; cin>>dd.y;
			
			cout<<"Enter the roll number:"; cin>>rno;
		}
		
		void displayresult()
		{
			cout<<"\nData of UG student\n";
			cout<<"..................\n";
			
			cout<<"Name:"<<name;
			cout<<"\nDate of birth:"<<dd.d<<"/"<<dd.m<<"/"<<dd.y;
			cout<<"\nRoll Number:"<<rno<<"\n";
		}			
};

main()
{
	pg p,*ptr1;
	ug u,*ptr2;
	
	ptr1=&p;
	ptr2=&u;
	
	ptr1->getdata();
	ptr2->getdata();
	ptr1->displayresult();
	ptr2->displayresult();
	
	return 0;
}