#include<stdio.h>
int main()
{
  int row,col,tree;
  scanf("%d%d%d",&row,&col,&tree);
  if(tree%col==0)
  {
    printf("It is a mango tree");
  }
  else
  {
    printf("It is not a mango tree");
  }
}