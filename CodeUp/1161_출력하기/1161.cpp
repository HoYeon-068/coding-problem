#include <stdio.h>
int main(){
	int a,b;
	scanf("%d %d",&a,&b);
	printf("%s+%s=%s",
		  a%2!=0?"홀수":"짝수",
		  b%2!=0?"홀수":"짝수",
		  (a+b)%2!=0?"홀수":"짝수");
	return 0;
}