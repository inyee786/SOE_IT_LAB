#include<iostream>
using namespace std;

struct link
{
	int data;
	link *next;
};

class linklist
{
	link *first;
	
	public:
		linklist()
		{
			first=NULL;
		}
		
		void insertcontent (int d)
		{
			link *n=new link;
			n->data=d;
			n->next=first;
			first=n;
		}
		
		void deletecontent()
		{
			
			while(first!=NULL)
			{
				link *t;
				t=first;
				first=first->next;
				delete t;
			}
		}
		
		void display()
		{
			while(first!=NULL)
			{
				cout<<first->data;
				first=first->next;
				cout<<"\n";
			}
		}
};

main()
{
	linklist obj;
	obj.insertcontent(10);
	obj.insertcontent(20);
	obj.insertcontent(30);
	obj.insertcontent(40);
	obj.display();
	obj.deletecontent();
	return 0;
}