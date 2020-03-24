#include<iostream>
using namespace std;
void elements(int arr[], int n)
{
    int temp [n];
    int j=0;
    for(int i=0;i<=n;i++)
    {
        if(arr[i]>=0)
            temp[j++]=arr[i];
    }
    if(j==n||j==0)
        return;
    for(int i=0;i<n;i++)
    {
        if(arr[i]<0)
            temp[j++]=arr[i];
        arr[i]=temp[i];
    }
}
int main()
{
int arr[]={2,-2,4,-3,-7,9,8,-6,-4};
int n=sizeof(arr)/sizeof(arr[0]);
elements (arr,n);
for(int i=0;i<n;i++)
    cout<<arr[i]<<" ";
    }

