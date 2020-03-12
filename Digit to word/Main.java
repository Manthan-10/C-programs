#include<stdio.h>
int main()
{
  int dig;
  scanf("%d",&dig);
  switch(dig)
  {
    case 0:
    {
      printf("Zero");
    }
      break;
    case 5:
    {
		printf("Five");
    }
      break;
    default:printf("Invalid Input");
  }
  
}