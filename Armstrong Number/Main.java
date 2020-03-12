#include<stdio.h>
int main()
{
  int num, originalNum, remainder, result = 0;
    scanf("%d", &num);
    originalNum = num;

    while (originalNum != 0) {
        remainder = originalNum % 10;
        result += remainder * remainder * remainder;
        originalNum /= 10;
    }

    if (result == num)
        printf("Armstrong Number");
    else
        printf("Not Armstrong Number");

}