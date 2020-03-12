#include<stdio.h>
int main()
{
  int x1,x2,x3,y1,y2,y3;
  scanf("%d%d%d%d%d%d",&x1,&y1,&x2,&y2,&x3,&y3);
  float x=(x1+x2+x3)/3.0;
  float y=(y1+y2+y3)/3;
  printf("%.1f\n",x);
  printf("%.1f\n",y);
}