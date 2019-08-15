#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main() {

    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    //take input of number of weed packets
    int limit;
    scanf("%d", &limit);
    
    //take input of prices of each weed packet
    int prices[limit];
    for(int i=0; i<limit; i++){
        scanf("%d", &prices[i]);
    }
    
    //order the array of prices in descending order
    int temp;
    for(int i=0; i<limit-1; i++){
        for(int j=0; j<limit-i-1; j++){
            if(prices[j]<prices[j+1]){
                temp = prices[j];
                prices[j] = prices[j+1];
                prices[j+1] = temp;
            }
        }
    }
    
    //Adding the prices; every third price is not to be added (since the third packet is free)
    int res=0;
    for(int i=0; i<limit; i++){
        if((i+1)%3!=0){
            res += prices[i];
        }
    }
    
    //print the resultant price
    printf("%d", res);
    
    return 0;
}
