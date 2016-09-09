#include<iostream>
using namespace std;
class STUDENT
{
    protected:
        int rno;
    public:
        void getnum(int a)
        {
            rno=a;
        }
        void putnum()
        {
            cout<<"Roll No. :"<<rno<<"\n";
        }
};
class TEST:public STUDENT
{
    protected:
        int mark1,mark2;
    public:
        void getmark(int b,int c)
        {
            mark1=b;
            mark2=c;
        }
        void putmark()
        {
            cout<<"Subject1 Marks :"<<mark1<<"\n";
            cout<<"Subject2 Marks :"<<mark2<<"\n";
        }
};
class SPORT
{
    protected:
        int swt;
    public:
        void getswt(int wt)
        {
            swt=wt;
        }
        void putswt()
        {
        cout<<"Sports Weightage :"<<swt<<"\n";
        }
};
class RESULT:public SPORT,public TEST
{
    protected:
        int cmlscr;
    public:
        void display()
        {
            cmlscr=mark1+mark2+swt;
            putnum();
            putmark();
            putswt();
            cout<<"Cumulative Score :"<<cmlscr<<"\n";
        }
};
int main()
{
    RESULT s;
    s.getnum(25);
    s.getmark(85,89);
    s.getswt(45);
    s.display();
    return 0;
}
