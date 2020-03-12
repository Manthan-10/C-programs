#include<stdio.h>
int main()
{
  //Fill your code
  int n,q;
  int hand;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    hand=7*n;
    if(n==10)
    {
      hand=4.5*n;
    }
  }
  printf("%d",hand);
}