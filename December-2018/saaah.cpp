#include <iostream>
#include <string>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    char kartik[1002];
    char maam[1002];
    cin>>kartik;
    cin>>maam;
    int i, flg = 1;
    for(i = 0; maam[i]!= '\0'; i++)
    {
        if(maam[i] == kartik[i])
            continue;
        else
        {
            flg = 0;
            break;
        }
    }
    if(flg == 1 && maam[i] == kartik[i])
    {
        cout<<"zabardast";
    }
    else
        cout<<"lalala";
        
    return 0;
}
