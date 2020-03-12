#include<stdio.h>
int main()
{
  int l,r;
  scanf("%d%d",&l,&r);
  if(l>r)
    printf("circle cannot be inside a Square");
  else
    printf("circle can be inside a square");
}