#include<stdio.h>

int Addition(int iNo1, int iNo2)
{
    int iSum = 0;
    iSum = iNo1 + iNo2;
    return iSum;
}

int main()
{
    int iNo1 = 0, iNo2 = 0, iAns = 0;

    printf("enter the first number : \n");
    scanf("%d",&iNo1);

    printf("enter the second number: \n");
    scanf("%d",&iNo2);

    iAns = Addition(iNo1,iNo2);
    printf("Addition is : ", iAns);
    return 0;
}