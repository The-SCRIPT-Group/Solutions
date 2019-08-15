#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <string>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    
    //take input of no. of Dictionary entries and no. of words in message
    int nD, nM;
    cin>>nD>>nM;
    
    //take input of all the dictionary entries in a 2-dimension array
    string dic[nD][2];
    for(int i=0; i<nD; i++){
        cin>>dic[i][0]>>dic[i][1];
    }
    
    //take input of the message in a string array
    string mes[nM];
    for(int i=0; i<nM; i++){
        cin>>mes[i];
    }
    
    bool boo = true;  //boolean to check if the word is in the dictionary
    for(int i=0; i<nM; i++){
        boo = true;
        for(int j=0; j<nD; j++){
            if(dic[j][0] == mes[i]){  //if the word is in the dictionary
                cout<<dic[j][1];
                boo = false;
                break;
            }
        }
        if(boo){  //if it isnt in the dictionary
            cout<<"whatcha sayin'?";
        }
        if(i != nM-1){
            cout<<endl;
        }
    }
    
    return 0;
}
