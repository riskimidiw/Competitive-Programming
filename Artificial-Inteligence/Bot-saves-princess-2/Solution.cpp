// Problem : https://www.hackerrank.com/challenges/saveprincess2

#include <iostream>
#include <math.h>
using namespace std;

int main() {
    char x;
    int n, x1 =0, x2=0, y1=0 ,y2=0, range;
    
    cin >> n;
    cin >> x1 >> y1;
    for(int i=0; i<n; i++) {
        for(int j=0; j<n; j++) {
            cin >> x;
            
            if(x == 'm') {
                x1 = i;
                y1 = j;
            }
            if(x == 'p') {
                x2 = i;
                y2 = j;
            }
        }
    }

    range = abs(x1-x2) + abs(y1-y2);

    if(x1-x2 < 0) {
        cout << "DOWN\n";
        x1++;
    }else if(x1-x2 > 0) {
        cout << "UP\n";
        x1--;   
    }else if(y1-y2 < 0) {
        cout << "RIGHT\n";
        y1++;
    }else {
        cout << "LEFT\n";
        y1--;
    }
}