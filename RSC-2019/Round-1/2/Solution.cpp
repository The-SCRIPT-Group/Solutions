#include <iostream>

int main() {
    int n;
    std::cin >> n;
    while (n>0) {
        int t1, t2;
        std::cin >> t1 >> t2;
        if (t2 - t1 >= 5) {
            std::cout << t1;
            return 0;
        }
        n--;
    }
    std::cout << "doggy sad";
}
