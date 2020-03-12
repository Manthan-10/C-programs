#include<stdio.h>
int main()
{
  //Fill your code
  int n,i,a=6;
  scanf("%d",&n);
  printf("Enter n value\n");
  printf("%d",a);
  for(i=3;i<n+n;i+=2)
  {
    int nt=a+i;
    printf(" %d",nt);
    a=nt;
  }
}