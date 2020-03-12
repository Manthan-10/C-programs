#include<stdio.h>
int main()
{
  	int start, end;
	scanf("%d",&start);
	scanf("%d",&end);
	int i, sum = 0;
	for(i = start; i <= end; i++)
	{
		sum = sum + i;
	}
	printf("%d",sum);
}