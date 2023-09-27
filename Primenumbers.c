#include<stdio.h>
int main (void)
{
    int p, i, prime[100], primeindex, isprime,n;
    prime[0]=2;
    prime[1]=3;
    primeindex=2;
    printf("enter the value till where you would like to check for prime numbers\n");
    scanf("%d",&n);
    for(p=5;p<=n;p=p+2)
    {
        isprime=1;
        for(i=0;i<primeindex;i++)
        {
            if(p%prime[i]==0)
            isprime=0;
        }
        if(isprime==1)
        {
            prime[primeindex]=p;
            ++primeindex;
        }
    }
    printf("primes below %d are:\n",n);
    for(i=0;i<primeindex;i++)
    printf("%d\n",prime[i]);
}