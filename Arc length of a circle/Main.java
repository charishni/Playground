#include<stdio.h>
int main()
{
  float r,a,t;
  scanf("%f%f",&r,&t);
  a=(2*3.14*r*t)/360;
  printf("%.2f",a);
  return 0;
  }