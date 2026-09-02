#include <stdio.h>
int main(){
	int n;
	scanf("%d",&n);
	if(n>0){
		printf("plus\n");
	}else{
		printf("minus\n");
	}
	
	if(n%2!=0){
		printf("odd");
	}else{
		printf("even");
	}
	
	return 0;
}