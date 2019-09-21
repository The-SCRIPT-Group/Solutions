#include <iostream>
using namespace std;


int main() {
    unsigned long long int ans = 1, num;
    cin>>num;
    if(num == 0)
        cout<<ans;
    else
    {
        for(long int i = 1; i <= num; i++)
        {
            ans *= i;
        }
        
    cout<<ans;
    }
    return 0;
}
