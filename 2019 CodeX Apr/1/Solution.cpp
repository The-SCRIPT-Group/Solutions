#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int s, p;       //s = no. of shawarmas ordered, p = no. of people

    cin>>s>>p;      //taking input of s and p from STDIN

    //The no. of extra shawarmas Hulk can eat is basically the remainder we get when we divide s by p.
    //To find remainder, we can use % operator
    cout<<(s % p);  //printing result to STDOUT

    return 0;
}
