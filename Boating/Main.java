#include<stdio.h>
int main()
{
  int bwt,adult,child;
  int wt;
  scanf("%d%d%d",&bwt,&adult,&child);
  wt=(75*adult)+(30*child);
  if(wt>bwt)
    printf("Boat will drow");
  else
    printf("Boat is stable");
}