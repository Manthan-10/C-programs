#include<stdio.h>
int main()
{
  int x;
  int sum,fd,ld;
  scanf("%d",&x);
  ld=x%10;
  while(x>=10)
  {
    x=x/10;
  }
  fd=x;
  sum=fd+ld;
    printf("%d",sum);
}