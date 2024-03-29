//InterviewProblems3

// A non-empty zero-indexed array A consisting of N integers and sorted in a non-decreasing order (i.e. A[0] ≤ A[1] ≤ ... ≤ A[N−1]) is given. The leader of this array is the value that occurs in more than half of the elements of A.

// You are given an implementation of a function:

//     class Solution { public int solution(int[] A); }

// that, given a non-empty zero-indexed array A consisting of N integers, sorted in a non-decreasing order, returns the leader of array A. The function should return −1 if array A does not contain a leader.

// For example, given array A consisting of ten elements such that:
//   A[0] = 2
//   A[1] = 2
//   A[2] = 2
//   A[3] = 2
//   A[4] = 2
//   A[5] = 3
//   A[6] = 4
//   A[7] = 4
//   A[8] = 4
//   A[9] = 6

// the function should return −1, because the value that occurs most frequently in the array, 2, occurs five times, and 5 is not more than half of 10.

// Given array A consisting of five elements such that:
//   A[0] = 1
//   A[1] = 1
//   A[2] = 1
//   A[3] = 1
//   A[4] = 50

// the function should return 1.

// Unfortunately, despite the fact that the function may return the expected result for the example input, there is a bug (or bugs) in the implementation, which may produce incorrect results for other inputs. Find the bug(s) and correct them. You should modify at most three lines of code.

// Assume that:

//         N is an integer within the range [1..100,000];
//         each element of array A is an integer within the range [0..2,147,483,647];
//         array A is sorted in non-decreasing order.

// Complexity:

//         expected worst-case time complexity is O(N);
//         expected worst-case space complexity is O(N), 
// 		beyond input storage (not counting the storage required for input arguments).

// Elements of input arrays can be modified.
// Copyright 2009–2017 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.




// Solution:



// using System;
// class Solution {
//     public int solution(int[] A) {
//         int n = A.Length;
//         int[] L = new int[n + 1];
//         L[0] = -1;
//         for (int i = 0; i < n; i++) {
//             L[i + 1] = A[i];
//         }
//         int count = 0;
//         int pos = (n + 1) / 2;
//         int candidate = L[pos];
//         for (int i = 1; i <= n; i++) {
//             if (L[i] == candidate)
//                 count = count + 1;
//         }
//         if (count > pos)
//             return candidate;
//         return (-1);
//     }
// }




// Running solution...
// Compilation successful.

// Example test:   [2, 2, 2, 2, 2, 3, 4, 4, 4, 6]
// OK (IGNORED)

// Example test:   [1, 1, 1, 1, 50]
// OK (IGNORED)

// You haven't modified anything in the initial solution. It contains a bug, and we ask you to fix it.

// Detected some errors.
 