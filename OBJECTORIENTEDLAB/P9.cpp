#include<iostream>
using namespace std;
const float MTF=3.280833;
class dist
{
	private:
	int feet;
	float inches;
	public:
	dist()
	{
		feet=0;inches=0.0;
	}
	dist(float meters)
	{
		float ftfeet=MTF*meters;
		feet=int(ftfeet);
		inches=12*(ftfeet-feet);
	}
	dist(int ft,float in)
	{
		feet=ft;inches=in;
	}
	void getdist()
	{
		cout<<"\n Enter inches:";
		cin>>inches;
	}
	void showdist()
	{
		cout<<feet<<"ft"<<inches<<"inch";
	}
	operator float()
	{
		float fracfeet=inches/12;
		fracfeet+=float(feet);
		return fracfeet/MTF;
	}
};
main()
{
	dist d1(1.0);
	cout<<"\nd1=";
	d1.showdist();
	dist d2(3,3.37);
	float mtrs=float(d2);
	cout<<"\nd2="<<mtrs<<"meters";
}



