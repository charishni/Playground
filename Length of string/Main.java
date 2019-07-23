#include<stdio.h>
int main()
{
  char str[100];
  gets (str);
  int t;
  t=strlen(str);
  printf("%d",t);
  return 0;
}