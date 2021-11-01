#include<iostream>
using namespace std;
int main()
{
    int n,sum,currsum=0,st=-1,en=-1;
    cin>>n>>sum;
    int a[n];
    for (int i = 0; i < n; i++)
    {
        cin>>a[i];
    }
    int i=0,j=0;
    while (j<n && currsum+a[j]<=sum)
    {
        currsum+=a[j];
        j++;
    }
    if(currsum==sum)
    {
        cout<<i+1<<" "<<j<<endl;
        return 0;
    }
    while (j<n)
    {
        currsum+=a[j];
        while (currsum>sum)
        {
            currsum-=a[i];
            i++;
        }
        if(currsum==sum)
        {
           st=i+1;
           en=j+1;
           break;
        }
    j++;
    }
    cout<<st<<" "<<en<<endl;
}
