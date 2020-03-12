#include<stdio.h>
int main()
{
  float milege;
  int petrol,distance;
  scanf("%f",&milege);
  scanf("%d%d",&petrol,&distance);
  if((milege*petrol)<distance)
  {
		printf("Cannot reach");
  }
  else
    printf("Can reach");
}