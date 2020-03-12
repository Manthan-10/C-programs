#include<stdio.h>
int main()
{
  int units,cost;
  scanf("%d",&units);
  if(units<=200)
  {
    cost=units*0.5;
    printf("Rs.%d",cost);
  }
  else if(units<=400)
  {
    cost=(units*0.65)+101;
    printf("Rs.%d",cost);
  }
  else if(units<=600)
  {
    cost=(units*0.80)+200;
    printf("Rs.%d",cost);
  }
  else
  {
    cost=(units*1.25)+425;
    printf("Rs.%d",cost);
  }
  
  
  
}