#include<stdio.h>
int main()
{
    long long number=600851475143;
     long long a=2, ans = 0, largestno;
    while(number!=0){
        if(number % a !=0)
            a= a + 1;
        else{
            largestno  = number;
            number = number / a;

            if(number == 1){
                printf("%d is the largest prime factor !",largestno);
                ans = 1;
                break;
            }
        }
    }
    return 0;
}
