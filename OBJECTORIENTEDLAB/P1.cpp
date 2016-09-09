#include<iostream.h>
struct student
{
	char name[50],gender[10];
    int age,sub1,sub2,sub3,total;	
};
int main()
{
	int i,n;
	struct student st[50];
	cout<<"enter the no of students";
	cin>>n;
	for(i=0;i<n;i++)
	{
	cout<<"   enter the NAME of student :  ";
	cin>>st[i].name;
	cout<<"   enter the GENDER          :  ";
	cin>>st[i].gender;
	cout<<"   enter your AGE            :  ";
	cin>>st[i].age;
	cout<<"enter mark of three SUBJECTS :  ";
	cin>>st[i].sub1>>st[i].sub2>>st[i].sub3;
	st[i].total=st[i].sub1+st[i].sub2+st[i].sub3;
	}
	//cout<<endl<<" TOTAL mark of "<<st[i].name <<"  is   " <<st[i].total<<endl;
	for(i=0;i<n;i++)
	{	
	cout<<endl<<" name\t age\tgender\tsub1\tsub2\tsub3\ttotal "<<endl;
	cout<<st[i].name <<"\t" << st[i].age<<"\t" <<st[i].gender<<"\t"<<st[i].sub1<<"\t" <<st[i].sub2<<"\t"<<st[i].sub3
	<<"\t"<<st[i].total<<endl;
	}
	}