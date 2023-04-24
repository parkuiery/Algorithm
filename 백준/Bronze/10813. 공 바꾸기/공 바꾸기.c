#include <stdio.h>
int ary[101];
int main() {
	int n1, n2;
	int a, b;
	int temp;
	scanf("%d %d", &n1, &n2);
	for (int i= 1; i <= n1; i++) {
		ary[i]=i;
	}
	for (int i = 1; i <= n2; i++) {
		scanf("%d %d", &a, &b);
		temp = ary[a];
		ary[a] = ary[b];
		ary[b] = temp;
	}
	for (int i = 1; i <= n1; i++) {
		printf("%d ", ary[i]);
	}
	return 0;
}