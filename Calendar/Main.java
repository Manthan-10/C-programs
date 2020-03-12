#include<stdio.h>
int main()
{
  int m,y;
  scanf("%d%d",&m,&y);
  if(y%4==0 && m==2)
  {
    printf("Number of days is 29");
  }
  switch(m)
  {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12: printf("Number of days is 31");
      break;
    case 2:printf("Number of days is 28");
      break;
    default:printf("Number of days is 30");
  }
      
}