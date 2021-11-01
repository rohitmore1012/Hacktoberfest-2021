#include<stdio.h>
#include<iostream>
using namespace std;
int main()
{
    string hex;
    int dec=0,x=1;
    cout<<"Enter hex no:\n";
    cin>>hex;
    int s= hex.size();
    for(int i=s-1;i>=0;i--)
    {
        if(hex[i]>='0'&&hex[i]<='9')
        {
           dec+=x*(hex[i]-'0');
        }
        if(hex[i]>='A' && hex[i]<='F')
        {
           dec+=x*(hex[i]-'A'+10);
        }
        x=x*16;
    }
    cout<<"Ricebag:"<<dec;
}
