#include<iostream>
using namespace std;

class student
{
	char name[50];
	int age;
	char sex;
	float m1,m2,m3,tot;
	
	public:
	
		void input();
		void calc();
		void disp();
		void output();
};

void student::input()
{
			cout<<"Enter the name of the student:";
			cin>>name;
	
			cout<<"Enter the age:";
			cin>>age;
	
			cout<<"Enter the sex:";
			cin>>sex;
		
			cout<<"Enter marks of 3 subjects\n"<<"m1=";
			cin>>m1;
		
			cout<<"m2=";
			cin>>m2;
		
			cout<<"m3=";
			cin>>m3;
}

	void student::calc()
	{
		tot=m1+m2+m3;
	}
	
	void student::disp()
	{
	
		cout<<"\nName:";
	
		cout<<"\tAge:";
	
		cout<<"\tSex:";
	
		cout<<"\tm1";
	
		cout<<"\tm2";
	
		cout<<"\tm3";
	
		cout<<"\tTotal";
	
		cout<<"\n";
	}
	
	void student::output()
	{
		
		cout<<name;
	
		cout<<"\t"<<age;
		
		cout<<"\t"<<sex;
	
		cout<<"\t"<<m1;
		
		cout<<"\t"<<m2;
	
		cout<<"\t"<<m3;
	
		cout<<"\t"<<tot<<"\n";
	
	}
	
	int main()
	{
		student s[10];
		int i,n;
		cout<<"Enter the total number of students:";
		cin>>n;
		
		
		for(i=1;i<=n;i++)
		{
			s[i].input();
			s[i].calc();
		}
		s[i].disp();
		
		for(i=1;i<=n;i++)
		s[i].output();
		
		 
	}
