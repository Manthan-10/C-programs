#include<stdio.h>
int main()
{
  char vowels;
  scanf("%c",&vowels);
  if(vowels=='a'|| 'A'||'e'||'E'||'i'||'I'||'o'||'O'||'u'||'U')
  {
    printf("ASCII of %c is %d",vowels,vowels);
  }
  else
  {
    printf("Not a vowel");
  }
}