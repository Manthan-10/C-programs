#include<stdio.h>
int main()
{
  int ch,a,z,A,Z;
  scanf("%c",&ch);
  if(ch>='a' && ch<='z')
  {
    printf("Lower");
  }
  else if(ch>='A' && ch<='Z')
  {
    printf("Upper");
  }
  else if(ch>=1 && ch<=9)
  {
    printf("Number");
  }
  else
    printf("Symbol");
}