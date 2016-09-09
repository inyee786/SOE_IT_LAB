#include<iostream>
#include<string.h>
#include<fstream>
using namespace std;

class student
{
	
	char name[50];
	float m1,m2,m3;
	
	public:
	int rno;
		student()
		{
			strcpy(name, " ");
			rno=0;
			m1=m2=m3=0.0;
		}
		void input()
		{
			cout<<"\nName:";
			cin>>name;
			
			cout<<"Roll Number:";
			cin>>rno;
			
			cout<<"Marks of 3 subjects\nm1="; cin>>m1;
			cout<<"m2="; cin>>m2;
			cout<<"m3="; cin>>m3;
		}
	
		void disp()
		{
			cout<<"\n"<<name;
			cout<<"\t"<<rno;
			cout<<"\t"<<m1<<"\t"<<m2<<"\t"<<m3<<"\n";
		}
		friend student coppy(student);
		
}s[10];

void tabb()
{
	cout<<"\nName\tNumber\tMark1\tMark2\tMark3";
	cout<<"\n....\t......\t.....\t.....\t.....";	
}
student coppy(student s1)
{
	student stud;
	strcpy(stud.name,s1.name);
	stud.rno=s1.rno;
	stud.m1=s1.m1;
	stud.m2=s1.m2;
	stud.m3=s1.m3;
	return stud;
}

main()
{
	student temp,ss;
	fstream f;
	int opt,n,i,r,pos=-1;
	char loop='y';
	f.open("stud.txt", ios::in|ios::out|ios::app);
	
	while(loop=='y'||loop=='Y')
	{
		cout<<"\n1.Enter details\n\n2.Display details\n\n3.Search a student\n\n4.Modify a record\n\n5.Delete a record\n\noption=";
		cin>>opt;
		
		switch(opt)
		{
			case 1:
				cout<<"Enter the number of students:";
				cin>>n;
					for(i=0;i<n;i++)
					{
						s[i].input();
						f.write((char*) &s[i], sizeof(s[i]));
					}
					
					break;
				
			case 2:	
				tabb();
				for(i=0;i<n;i++)
				{
					f.read((char*) &s[i], sizeof(s[i]));
					s[i].disp();
				}	
				break;
				
			case 3:
				
				pos=-1;
				cout<<"Enter the roll number to be searched:";
				cin>>r;
				for(i=0;i<n;i++)
				{
					if(s[i].rno==r)
					{
						cout<<"\n...Student present...\n";
						pos=i;
						break;
					}
				}
				if(pos!=-1)
				{
					tabb();
					s[pos].disp();	
				}
				else
					cout<<"\n...Student not present...\n";
					
				break;
								
			case 4:
				pos=-1;
				cout<<"Enter the roll number of the student:";
				cin>>r;
				for(i=0;i<n;i++)
				{
					if(s[i].rno==r)
					{
						cout<<"\n...Enter new details...\n";
						pos=i;
						break;
					}
				}
				if(pos!=-1)
				{
					s[pos].input();	
				}
				else
					cout<<"\n...Student not present...\n";
				
				break;
				
			case 5:
				pos=-1;
				cout<<"Enter the roll number of the student:";
				cin>>r;
				for(i=0;i<n;i++)
				{
					if(s[i].rno==r)
					{
						pos=i;
							while(pos!=n)
							{
								temp=coppy(s[pos]);
								s[pos]=(s[pos+1]);
								s[pos+1]=(temp);
								pos=pos+1;
							}
							n=n-1;
		
						break;
					}
				}
				if(pos==-1)
				{
					cout<<"\n...Student not present...\n";
				}
				else
					cout<<"\n...Successfully Deleted...\n";
			
				break;
			
			default:
				cout<<"\nInvalid selection\n";
						
		}
		cout<<"\nDo you want to continue(y/n):";
		cin>>loop;
	}
return 0;
}