#include<iostream>
#include<string>
using namespace std;
int main()
{
	int ch;
	string s1("98765");
	string s2("ZYXWV");
	cout<<"\n Original String";
	cout<<"\n\n First String:\t"<<s1;
	cout<<"\n Second String:\t"<<s2;
	cout<<"\n\n Select any from the List:";
	cout<<" \n\n 1.Insert \n 2.Delete\n 3.Replace\n 4.Change Case\n";
	cin>>ch;
	switch(ch)
	{
		case 1:cout<<"\nPlace Secong String inside First String";
		       s1.insert(4,s2);
		       cout<<"\n\nThe Modified String is"<<s1<<"\n";
		break;
		case 2:cout<<"\nRemove the Char from First String";
		       s1.erase(4,5);
		       cout<<"\n\nNow First String is"<<s1<<"\n";
		break;
		case 3:cout<<"\nReplace the 3 Middle Characters in Second String with First String ";
		       s2.replace(1,3,s1);
	           cout<<"\n\nNow Second String"<<s2<<"\n";
		break;
		case 4:cout<<"\nChange Case";
		       int n;

		       cout<<"\n\nEnter the case of your String";
		     	cin>>n;
		       for(int i=0;i<s2.length();i++)
		     {


		     	if(n==1)
		     	s2.at(i)=tolower(s2.at(i));
		     	else
			    s2.at(i)=toupper(s2.at(i));
		     }
		     cout<<"\n\nThe Changed String"<<s2<<"\n";
		 break;
		default:cout<<"\nInvalid Choice";
	}
}
