#include<stdio.h>
int main()
{
  int s,water;
  scanf("%d%d",&s,&water);
  if((s*s*s*1000)>water)
  {
    printf("Can store");
  }
  else printf("Cannot store");
}