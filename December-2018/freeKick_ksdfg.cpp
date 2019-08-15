#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    int ht[3];
    for(int i=0; i<3; i++){
        scanf("%d", &ht[i]);
    }
    
    int temp;
    for(int i=0; i<2; i++){
        for(int j=0; j<2-i; j++){
            if(ht[j]>ht[j+1]){
                temp = ht[j+1];
                ht[j+1] = ht[j];
                ht[j] = temp;
            }
        }
    }
    
    char order[3];
    scanf("%s", order);
    
    for(int i=0; i<3; i++){
        if(order[i] == 'C'){
            printf("%d", ht[2]);
        }
        else if(order[i] == 'B'){
            printf("%d", ht[1]);
        }
        else{
            printf("%d", ht[0]);
        }
        
        if(i!=2){
            printf(" ");
        }
    }
    
    return 0;
}
