// Problem : https://www.hackerrank.com/challenges/arrays-introduction/problem

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    int n, a;
    cin >> n;
    int arr[n];
    
    for(int i=n-1; i>=0; i--) {
        cin >> a;
        arr[i] = a;
    }
    
    for(int i=0; i<n; i++) {
        cout << arr[i] << " ";
    }
    
    return 0;
}