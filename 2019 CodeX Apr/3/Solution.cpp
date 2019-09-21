#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    float fluid;  //amount of web fluid peter has left
    cin>>fluid;
    
    //we calculate the max distance peter can travel using given formula
    //cbrt(a) basically returns the cube root of a
    //pow(a,b) basically returns a^b
    float distance = (3.14/3) * pow(fluid, 2.0/3.0);
    
    if(distance >= 14){ //since peter needs to travel 7km to get home, and 7km to get back to school
        cout<<"YIPEE";
    }
    else{
        cout<<"OH CRAP";
    }
    
    return 0;
}
