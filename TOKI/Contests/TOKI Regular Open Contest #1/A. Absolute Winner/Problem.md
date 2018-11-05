# Absolute Winner
Time limit | Memory limit
---------- | ------------
1 s | 64 MB

## Description
Three people have just played a racing game on a console. Initially, each player had 0 points. They played at least one round. For each round:

- The 1st place gets 4 points.
- The 2nd place gets 2 points.
- The 3rd place (last place) gets 1 points.

Now, you know that their total points are A, B, and C. Is there any player who is an Absolute Winner; that is, a person who always won the 1st place?

## Input Format
The input is given in the following format:

  A B C
## Output Format
A single line containing the string YA (Indonesian for yes) if there is any person who is an Absolute Winner, or the string TIDAK (Indonesian for no) if not.

## Sample Input 1
    12 6 3
## Sample Output 1
    YA
## Sample Input 2
    22 13 7
## Sample Output 2
    TIDAK
## Explanation of Sample
In sample 1, the first player always won the 1st place. Therefore, he is an Absolute Winner.

## Constraints
    1 ≤ A, B, C ≤ 100
It is guaranteed that there exists at least a sequence of winners for every round leading to the total points of A, B, and C.
