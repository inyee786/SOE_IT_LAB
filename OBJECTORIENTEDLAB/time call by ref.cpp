#include<iostream>
using namespace std;
class Time
{
	int hours;
	int minutes;
	public:
	void gettime(int h,int m)
	{
		hours=h,minutes=m;
	}
	void puttime()
	{
		cout<<hours<<"hours and";
		cout<<minutes<<"minutes"<<"\n";
	}
	void sum (Time time1,Time time2);
};
void Time::sum(Time time1, Time time2)
{
	minutes=time1.minutes+time2.minutes;
hours=time1.hours+time2.hours;
}
	int main()
{
	
Time time1,time2,time3;
time1.gettime(2,45);
time2.gettime(3,30);
time3.sum(time1,time2);
time3.puttime();
}
