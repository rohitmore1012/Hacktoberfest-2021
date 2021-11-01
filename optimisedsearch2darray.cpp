#include<iostream>
using namespace std;
int main()
{
    int m,n,key;
    cin>>m>>n>>key;
    int arr[m][n],c=n-1,r=0;
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<m;j++)
        {
            cin>>arr[i][j]; 
        }
    }
    bool found=false;
    while(r<n&&c>=0)
    {
        if(arr[r][c]==key)
        {
           found=true;
        }
        if(arr[r][c]>key)
        {
            c--;
        }
        else
        {
            r++;
        }
    }
    if(found)
    {
        cout<<"Found"<<endl;
    }
    else
    {
        cout<<"Not found"<<endl;
    }
    return 0;
}
