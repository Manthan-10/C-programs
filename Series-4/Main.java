#include<stdio.h>
int main()
{
  //Fill your code
  int i,n;
  printf("Enter n value\n");
  scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		printf("%d ",i*i-1);
	}
}