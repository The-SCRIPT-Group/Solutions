#include <iostream>

using namespace std;

unsigned long long int check(unsigned long long int n)
{
    if (n == -1) {
        return 0;
    }
    short remainder = n % 8;
    unsigned long long int s = ((n/8)*4) + 1;
    if (remainder != 0) {
        switch (remainder) {
            case 2: s+=1; break;
            case 3:
            case 4:
            case 5: 
            case 6: s+=2; break;
            case 7: s+=3; break;
        }
    }
    return s;
}   
int main()
{
    long long int t;
    cin >> t;
    while(t--) {
        unsigned long long int x,y;
        cin >> x >> y;
        cout << check(y-x)<< "\n";
    }
}
