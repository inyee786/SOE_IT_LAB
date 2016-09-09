#include<iostream>
using namespace std;

template<class t>

void bubsort(t ar[], int s)
{
	int i,j;
	
	for(i=1;i<s;i++)
	{
		for(j=0;j<s-i;j++)
		{
			if(ar[j]>ar[j+1])
			{
				t temp;
				temp=ar[j];
				ar[j]=ar[j+1];
				ar[j+1]=temp;	
			}
		}
	}
	cout<<"\n...Sorted array...\n";
		for(i=0;i<s;i++)
			cout<<ar[i]<<" ";	
}

main()
{
	int opt,a[10],i,size;
	double d[10];
	char loop='y';
	while(loop=='y'||loop=='Y')
	{
		cout<<"1.Integer datatype array\n2.Double datatype array\noption:";
		cin>>opt;
		
		switch(opt)
		{
			case 1:
				cout<<"Enter the size of the array\n";
				cin>>size;
				cout<<"Enter the array elements\n";
				for(i=0;i<size;i++)
					cin>>a[i];
				bubsort(a,size);
				break;
				
			case 2:
				cout<<"Enter the size of the array\n";
				cin>>size;
				cout<<"Enter the array elements\n";
				for(i=0;i<size;i++)
					cin>>d[i];
				bubsort(d,size);
				break;
				
			default:
				cout<<"Invalid Option...\n";
				break;
		}
		cout<<"\nDo you want to continue(y/n):";
		cin>>loop;
	}
return 0;
}