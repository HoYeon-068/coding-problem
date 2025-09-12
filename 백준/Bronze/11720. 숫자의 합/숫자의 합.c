#include<stdio.h>
int main(void)
{
	int N,sum=0;
	char a[100];
	scanf("%d", &N);
	for (int i = 0; i < N; i++)
	{
		scanf("%1d", &a[i]);
	}
	for (int i = 0; i < N; i++)
	{
		sum += a[i];
	}
	printf("%d\n", sum);
	return 0;
}