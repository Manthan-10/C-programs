#include<stdio.h>
int main()
{
  float r,h,amt,hr;
  scanf("%f%f%f%f",&r,&h,&amt,&hr);
  float vol=3.14*r*r*h;
  float rec=amt*hr;
  if(rec<vol)
    printf("The tank cannot be filled within %.1f hours",hr);
  else
    printf("The tank can be filled within %.1f hours",hr);
}