// Problem : https://www.hackerrank.com/challenges/js10-loops/problem

'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function vowelsAndConsonants(s) {
    for(var i=0; i<s.length; i++) {
        if(s[i] == 'a' || s[i] == 'i' || s[i] == 'u' || s[i] == 'e' || s[i] == 'o') {
            console.log(s[i]);
        }
    }
    for(var i=0; i<s.length; i++) {
        if(s[i] != 'a' && s[i] != 'i' && s[i] != 'u' && s[i] != 'e' && s[i] != 'o') {
            console.log(s[i]);
        }
    }
}

function main() {
    const s = readLine();
    
    vowelsAndConsonants(s);
}