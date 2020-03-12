#include<stdio.h>
int main()
{
  //Fill your code
  int n,a=2,nt;
  scanf("%d",&n);
  printf("%d",a);
  for(int i=2;i<n+1;i++)
  {
    	nt=((a+1)*2)-i;
    	printf(" %d",nt);
    a=nt;
  }
}