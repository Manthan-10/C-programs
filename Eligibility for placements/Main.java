#include<stdio.h>
#include<string.h>
int main()
{
  char name[10];
  int reg;
  float cgpa;
  int arrears;
  scanf("%s",&name);
  scanf("%d",&reg);
  scanf("%f",&cgpa);
  scanf("%d",&arrears);
  if(arrears==0 && cgpa>=7.0)
  {
    printf("Eligible");
  }
  else 
    printf("%s\n%d\nNot Eligible to attend placement",name,reg);
}