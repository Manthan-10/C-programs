#include<stdio.h>
int main()
{
  int x,y;
  int z;
  scanf("%d%d",&x,&y);
  if(y>x)
  {
  	z=y-4;
  	printf("%d",z);
  }
  else
  {
    z=x-3;
    printf("%d",z);
  }
}