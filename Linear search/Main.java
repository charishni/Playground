#include<stdio.h>
int main()
{
   int a[10],i,n,m,c=0;
    scanf("%d",&n);
    for(i=0;i<=n-1;i++)
    {
         scanf("%d",&a[i]);
    }
    scanf("%d",&m);
    for(i=0;i<=n-1;i++)
    {
         if(a[i]==m)
         {
             c=1;
             break;
         }
    }
    if(c==0)
         printf("%d isn't present in the array.",m);
    else
         printf("%d",i+1);

}