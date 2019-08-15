#include <string.h>
#include <iostream>

using namespace std;


bool keyExists(string key, string s[][2], int n) {
    int i;
    for (i = 0; i < n; i++) {
        if (s[i][0] == key) {
            return true;
        }
    }
    return false;
}

string getValue(string key, string s[][2], int n) {
    int i;
    for (i = 0; i < n; i++) {
        if (s[i][0] == key) {
            return s[i][1];
        }
    }
    return NULL;
}

int indexOf(string s, char c, int n) {
    int i;
    for (i = n; s[i] != '\0'; i++) {
        if (s[i] == c) {
            return i;
        }
    }
    return -1;
}

int indexOf(string s, char c) {
    return indexOf(s, c, 0);
}

int main() {
    int i, index, n;
    string t;
    cin >> n;
    getchar();
    //getline(cin, t);
    //n = stoi(t);
    string s[n][2];

    for (i = 0; i < n; i++) {
        string temp;
        getline(cin, temp);
        index = indexOf(temp, ':');
        s[i][0] = temp.substr(0, index);
        s[i][1] = temp.substr(index + 1);   
    }

    getline(cin, t);
    index = indexOf(t, ' ');
    string I = t.substr(0, index);
    string am = t.substr(index + 1, indexOf(t, ' ', index + 1) - (index + 1));
    index = indexOf(t, ' ', index + 1);
    string groot = t.substr(index + 1);
    if (keyExists(t, s, n)) {
        cout << getValue(t, s, n);
    } else if (keyExists(I+" "+am, s, n)) {
        cout << getValue(I+" "+am, s, n) << " " << getValue(groot, s, n);
    } else if (keyExists(am+" "+groot, s, n)) {
        cout << getValue(I, s, n) << " " << getValue(am+" "+groot, s, n);
    } else {
        cout << getValue(I, s, n) << " " << getValue(am, s, n) << " " << getValue(groot, s, n);
    }
}