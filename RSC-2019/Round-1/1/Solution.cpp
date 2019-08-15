#include <iostream>

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
    std::cin >> n;
    if (n <= 1) {
        std::cout << "NONE";
    } else {
        if(prime(n)) {
            std::cout << "PRIME";
        } else {
            std::cout << "NOT PRIME";
        }
    }
}