#include<stdio.h>
int main()
{
  float wt,ht;
  scanf("%f%f",&wt,&ht);
  float bmi=wt/ht;
  if(wt==100)
    printf("You are underweight. Have an apple daily.");
  else if(wt==75)
    printf("You are normal. Go walking daily and maintain it.");
  else
    printf("You are obese. Go to doctor");
}