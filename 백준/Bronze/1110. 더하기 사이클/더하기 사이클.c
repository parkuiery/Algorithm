#include <stdio.h>
int main() {
	int n,n1,n2,n3,cnt=0;
	scanf("%d", &n);
	n3 = n;
	do {
		n = (n / 10 + n % 10) % 10 + (n % 10) * 10;
		cnt++;
	} while (n3 != n);
	printf("%d", cnt);
	return 0;
}