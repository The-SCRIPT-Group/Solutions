#include <iostream>
using namespace std;


int main() {
    int t, ans = 1;
    cin>>t;
    for(int i = 1; i <= t; i++)
        ans = ans * i;
    cout<<ans;
    return 0;
}
