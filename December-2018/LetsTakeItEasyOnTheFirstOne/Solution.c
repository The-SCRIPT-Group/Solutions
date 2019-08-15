#include <stdio.h>

int main() {
    unsigned long long int n, f=1, i;
    scanf("%llu", &n);
    if (n == 0) printf("1");
    else {
        for (i=1;i<=n;i++) f*=i;
        printf("%llu", f);
    }
    return 0;
}
