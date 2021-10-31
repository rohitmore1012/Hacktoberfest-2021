#include<bits/stdc++.h>
using namespace std;

int jumpingOnClouds(vector<int> c, int k) {
    int energy=100,index=0;
    do{
        energy--;
        if(c[index]==1)
            energy=energy-2;
        index=(index+k)%c.size();
    }while(index!=0);
    
    return energy;
    
}

int main()
{
   vector<int>v={0,0,1,0,0,1,1,0};
   cout<<jumpingOnClouds(v,2);
    return 0;
}
