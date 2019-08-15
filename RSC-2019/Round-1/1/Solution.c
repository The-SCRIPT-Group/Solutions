#include <stdio.h>

int prime(int n) {
    int c, i;
    c = 0;
    for (i = 2; i < n; i++) {
        if (n%i == 0) {
            c++;
        }
    }
    return !c;
}

int main() {
    int n;
    scanf("%d", &n);
    if (n <= 1) {
        printf("NONE");
    } else {
        if(prime(n)) {
            printf("PRIME");
        } else {
            printf("NOT PRIME");
        }
    }
}