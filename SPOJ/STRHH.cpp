// Status  : Accepted
// Problem : https://www.spoj.com/problems/STRHH/

#include <iostream>
using namespace std;

int main() {
    int t;
    string word;
    
    cin >> t;
    for(int i=0; i<t; i++) {
        cin >> word;
        for(int j=0; j<word.length()/2; j=j+2) {
            cout << word[j];
        }
        cout << endl;
    }
    return 0;
}