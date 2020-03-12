#include<stdio.h>
int main()
{
  int wl,wb,fl,fb,sl,sb;
  scanf("%d%d%d%d%d%d",&wl,&wb,&fl,&fb,&sl,&sb);
  float aw,af,as,area;
  aw=wl*wb;
  af=fl*fb;
  as=sl*sb;
  area=af+as;
  if(aw>=area)
  {
    printf("Raj can fix both painting");
  }
  else
  {
    printf("Raj cannot fix both painting");
  }
}