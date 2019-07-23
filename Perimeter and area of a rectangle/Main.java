#include<stdio.h>
int main()
{
   int a=6;
  int b=9;
  int perimeter, area;
  perimeter=2*(a+b);
  area=a*b;
  printf("The perimeter of the rectangle is: %d cm\n", perimeter);
  printf("The area of the rectangle is: %d sq cm",area);
  return 0;
}