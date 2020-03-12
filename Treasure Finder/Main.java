#include<stdio.h>
int main()
{
  int fb,sb,tb;
  scanf("%d%d%d",&fb,&sb,&tb);
  if(sb==4)
    printf("The treasure is in the box which has number %d.\n",sb);
  else 
    printf("The treasure is in the box which has number %d.\n",tb);
  if(sb==4)
    printf("The code to open the box is 2.\n");
  else
    printf("The code to open the box is 7.\n");
}