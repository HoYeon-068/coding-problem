#include <stdio.h>
int main(){
	int a,sum=0;
	scanf("%d",&a);
	for(int i=2;i<=a;i+=2){
		sum+=i;
	}
	printf("%d",sum);
	return 0;
}