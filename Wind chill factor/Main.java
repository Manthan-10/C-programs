#include<stdio.h>
#include<math.h>
int main()
{
  int t,v;
  float wcf,result;
  scanf("%d%d",&t,&v);
  result=pow(v,0.16);
  wcf=(35.74+(0.6215*t)+((0.4275*t)-35.75)*result);
  printf("%.2f",wcf);
}