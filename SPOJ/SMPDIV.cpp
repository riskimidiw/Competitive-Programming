// Status  : Accepted
// Problem : https://www.spoj.com/problems/SMPDIV/

#include <iostream>
using namespace std;

int main() {
    int t, n, x, y;
    
    cin >> t;
    for(int i=0; i<t; i++) {
        cin >> n >> x >> y;
        for(int j=0; j<n; j+=x) {
            if(j%y != 0) {
                cout << j << " ";
            }
        }
        cout << endl;
    }
    return 0;
}