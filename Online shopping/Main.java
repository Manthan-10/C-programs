#include<stdio.h>
int main()
{
   
  int famount,fdisc,fship,samount,sdisc,sship,aamount,adisc,aship;
  scanf("%d%d%d%d%d%d%d%d%d",&famount,&fdisc,&fship,&samount,&sdisc,&sship,&aamount,&adisc,&aship);
  int flip,snap,ama;
  flip=famount+fship-((fdisc*famount)/100);
  snap=samount+sship-((sdisc*samount)/100);
  ama=aamount+aship-((adisc*aamount)/100);
  printf("In Flipkart: Rs.%d\n",flip);
  printf("In Snapdeal: Rs.%d\n",snap);
  printf("In Amazon: Rs.%d\n",ama);
  printf("He will prefer Snapdeal");
}