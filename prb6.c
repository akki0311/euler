#include<stdio.h>
main()
{
    int n,i,sum;int sq=0;
    int sum1=0;
    i=1,sum=0;
    printf("Enter Maximum Value(n):");
    scanf("%d",&n);
    while(i<=n)
    {
        sum=sum+i*i;
        ++i;
        
    }
    for(i=1;i<=n;i++)
    {
    	sum1=sum1+i;
    	sq=sum1*sum1;
	}
    int diff=sq-sum;
    printf("Sum of squares of numbers from 1 to n is :%d\n ",sum);
    printf("the square of sum is %d\n",sq);
    printf("The difference is %d",diff);
    return 0;
}
