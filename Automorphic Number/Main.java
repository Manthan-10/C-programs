#include<stdio.h>
int main()
{
   int a;
  int x,y;
  scanf("%d",&a);
  x=a*a;
  y=x%10;
  if(a>0 && a<9)
  {
  	if(a==y)
    	printf("Automorphic Number");
  	else 
    	printf("Not Automorphic Number");
  }
}