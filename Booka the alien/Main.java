#include<stdio.h>
int main()
{
  int ndays,week,year,days;
  scanf("%d",&ndays);
  year=ndays/365;
  week=(ndays%365)/7;
  days=(ndays%365)/7;
  printf("%d\n",year);
  printf("%d\n",week);
  printf("%d\n",days);
}