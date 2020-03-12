#include<stdio.h>
int main()
{
  int sal,bank,fees,food,parent;
  scanf("%d%d%d%d%d",&sal,&bank,&fees,&food,&parent);
  if((bank+fees+food+parent)>=sal)
  {
    printf("He has to work hard");
  }
  else
  {
    printf("He can save the money");
  }
  
}