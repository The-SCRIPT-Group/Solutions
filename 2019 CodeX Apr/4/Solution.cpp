#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int binary;                         //to store given binary no.
    cin>>binary;
    
    int base = 1;                       //base starts as 2^0 = 1 
    int decimal = 0;                    //to store the decimal form of the given binary no.
    int digit;                          //to store the last digit of the current binary number
    
    while(binary){
        digit = binary % 10;            //store last digit of binary into digit
        binary = binary/10;             //basically removing the last digit from the binary
        decimal += digit * base;        //formula for binary to decimal
        base *= 2;                      //for next digit, base will be 2^(i+1) if it was 2^i for this digit
    }
    
    cout<<"MK-"<<decimal;
    
    return 0;
}
