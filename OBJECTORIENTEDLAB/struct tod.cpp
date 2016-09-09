#include<iostream.h>
#include<stdio.h>
#include<conio.h>

struct student
{
	char name[30];
	int age;
	char sex;
	float m1,m2,m3,tot;
};

void main()
{
		student s[10];
		int i,n;
		cout<<"Enter the total number of students:";
		cin>>n;
		
		for(i=1;i<=n;i++)
		{
			
			cout<<"Enter the name of the student:";
			cin>>s[i].name;
	
			cout<<"Enter the age:";
			cin>>s[i].age;
	
			cout<<"Enter the sex:";
			cin>>s[i].sex;
		
			cout<<"Enter marks of 3 subjects\n"<<"m1=";
			cin>>s[i].m1;
		
			cout<<"m2=";
			cin>>s[i].m2;
		
			cout<<"m3=";
			cin>>s[i].m3;
		
			s[i].tot=s[i].m1+s[i].m2+s[i].m3;
		}
	
	clrscr();
	
	cout<<"\nName:";
	
	cout<<"\tAge:";
	
	cout<<"\tSex:";
	
	cout<<"\tm1";
	
	cout<<"\tm2";
	
	cout<<"\tm3";
	
	cout<<"\tTotal";
	
	cout<<"\n";
	
	for(i=1;i<=n;i++)
	{
		
		cout<<s[i].name;
	
		cout<<"\t"<<s[i].age;
		
		cout<<"\t"<<s[i].sex;
	
		cout<<"\t"<<s[i].m1;
		
		cout<<"\t"<<s[i].m2;
	
		cout<<"\t"<<s[i].m3;
	
		cout<<"\t"<<s[i].tot<<"\n";
	}
}