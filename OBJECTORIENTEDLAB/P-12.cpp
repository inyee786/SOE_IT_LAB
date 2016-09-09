#include<iostream>
using namespace std;
class student
{
	protected:
    int rno;
    public:
    student()
    {
    	rno=0;
    }
    void get_no(int a)
	{
		rno=a;
	}
	void put_no()
	{
		cout<<"Roll No : "<<rno;
	}
};
class test : public student
{
	protected:
	float sub1,sub2;
	public:
	test()
	{
		sub1=0;sub2=0;
	}
	void get_marks(float x,float y)
	{
		sub1=x;sub2=y;
	}
	void put_marks()
	{
		cout<<"\nsub1 = "<<sub1;
		cout<<"\nsub2 = "<<sub2;
	}
};
class sports
{
	protected:
	float score;
	public:
	sports()
	{
		score=0;
	}
	void get_score(float s)
	{
		score=s;
	}
	void put_score()
	{
		cout<<"\nSport wt = "<<score;
	}
};
class result:public test,public sports
{
	float total;
	public:
	result ()
	{
		total =0;
	}
	void display()
	{
		total=sub1+sub2+score;
		put_no();
		put_marks();
		put_score();
		cout<<"\nTotal = "<<total;
	}
};
int main()
{
	result s;
	s.get_no(14140042);
	s.get_marks(87.9,94.0);
	s.get_score(8.0);
	s.display();
}