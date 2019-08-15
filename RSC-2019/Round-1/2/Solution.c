#include <stdio.h>

int main() {
    int n;
    scanf("%d", &n);
    while (n>0) {
        int t1, t2;
        scanf("%d%d", &t1, &t2);
        if (t2 - t1 >= 5) {
            printf("%d", t1);
            return 0;
        }
        n--;
    }
    printf("doggy sad");
}