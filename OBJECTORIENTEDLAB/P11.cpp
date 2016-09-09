#include<iostream.h>
#include<conio.h>

class Student
{
	protected:
	int usn,age;
	char name[20];

};

class Ug : public Student
{
	int sem,fee,sti;

	public:
	void getdata()
	{
		cout<<"\nEnetr Usn , Name , Age : ";
		cin>>usn>>name>>age;
		cout<<"\nEnter Sem,Fee,Stipend : ";
		cin>>sem>>fee>>sti;
	}

	void display()
	{
		cout<<name<<"\t"<<age<<"\t"<<sem<<"\n";
	}

	int getsem()
	{
		return(sem);
	}

	int getage()
	{
		return(age);
	}

};

class Pg : public Student
{
	int sem,fee,sti;

	public:
	void getdata()
	{
		cout<<"\nEnetr Usn , Name , Age : ";
		cin>>usn>>name>>age;

		cout<<"\nEnter Sem,Fee,Stipend : ";
		cin>>sem>>fee>>sti;
	}

	void display()
	{
		cout<<name<<"\t"<<age<<"\t"<<sem<<"\n";
	}

	int getsem()
	{
		return(sem);
	}

	int getage()
	{
		return(age);
	}

};

int main()
{
	clrscr();

	Pg p[2];
	Ug u[2];

	int flag,age,sem,agesum=0,semcnt=0,j,i;

	cout<<"\n\nEnter Pg students details..\n";
	for(i=0; i<2; i++ )
		p[i].getdata();

	cout<<"\n\nEnter Ug students details..\n";
	for(i=0; i<2; i++ )
		u[i].getdata();

	cout<<"\nUG - students details..\n";
	cout<<"--------------------------\n";
	cout<<"Name\tAge\tSem\n";
	for(i=0; i<2; i++ )
		u[i].display();
	cout<<"--------------------------\n";
	for(i=1; i<9; i++ )
	{
		flag=0;
		for(j=0; j<2; j++ )
		{
			sem=u[j].getsem();
			age=u[j].getage();

			if( i==sem )
			{
				agesum+=age;
				semcnt++;
				flag=1;
			}
		}
	if(flag)
	   cout<<i<<"\t"<<agesum/semcnt<<endl;
}

	agesum=0,semcnt=0;

	cout<<"\n\nPG - students details..\n";
	cout<<"--------------------------\n";
	cout<<"Name\tAge\tSem\n";
	for(i=0; i<2; i++ )
		p[i].display();
	cout<<"--------------------------\n";
	for(i=1; i<9; i++ )
	{
		flag=0;
		for(j=0; j<2; j++ )
		{
			sem=p[j].getsem();
			age=p[j].getage();

			if( i==sem )
			{
				agesum+=age;
				semcnt++;
				flag=1;
			}
		}
			if(flag)
			cout<<i<<"\t"<<agesum/semcnt<<endl;
	}

	getch();
	return 0;

}