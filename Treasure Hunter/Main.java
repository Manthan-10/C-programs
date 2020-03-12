#include<stdio.h>
int main()
{
  int gold,benper,blackper;
  int ben,black,pirate;
  scanf("%d%d%d",&gold,&benper,&blackper);
  ben=0.01*benper*gold;
  black=0.01*blackper*(gold-ben);
  pirate=(gold-(black+ben))/3;
  printf("%d\n",ben);
  printf("%d\n",black);
  printf("%d\n",pirate);
}