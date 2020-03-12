#include<stdio.h>
int main()
{
  //fill your code
  int n, i,sum=0;
  do
  {
    scanf("%d",&n);
    if(n>0)
    {
      sum=sum+n;
    }
  }
  while(n!=-1);
  {
    printf("%d",sum);
  }
}