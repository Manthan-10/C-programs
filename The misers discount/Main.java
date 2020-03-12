#include<stdio.h>
int main()
{
  	float item1,item2,discount;
  	float amount,price,saved;
  	scanf("%f%f%f",&item1,&item2,&discount);
  	amount=item1+item2;
  	price=(discount/100)*amount;
  	saved=amount-price;
  	printf("%.2f\n",amount);
  	printf("%.2f\n",saved);
  	printf("%.2f\n",price);
}