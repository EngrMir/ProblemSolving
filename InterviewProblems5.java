// //InterviewProblems5





// // you can use includes, for example:
// #include <algorithm>

// // you can write to stdout for debugging purposes, e.g.
// // cout << "this is a debug message" << endl;

// void checkNeighbor(const vector<vector<int> > &A, vector<vector<int> > &B, int i,int j, int N, int M){

//     if(B[i][j] == -1) return;
//         B[i][j] = -1;

//     if(i+1 < N)
//     if(A[i+1][j] == A[i][j]) checkNeighbor(A, B, i+1, j, N, M);
//     if(i-1 >= 0)
//     if(A[i-1][j] == A[i][j]) checkNeighbor(A, B, i-1, j, N, M);
//     if(j+1 < M)
//     if(A[i][j+1] == A[i][j]) checkNeighbor(A, B, i, j+1, N, M);
//     if(j-1 >= 0)
//     if(A[i][j-1] == A[i][j]) checkNeighbor(A, B, i, j-1, N, M);

// }


// int solution(vector< vector<int> > &A) {
//     // write your code in C++14 (g++ 6.2.0)
//         if (A.empty()) return 0;
//         int sum = 0;
//         int N = A.size();
//         int M = A[0].size(); 

//     if (N ==0 || M==0) return 0;
//         vector<vector<int> > B(A);

//     for(int i=0; i<N; i++)  

//     for(int j = 0; j<M; j++) {
//         if (B[i][j] >= 0) {
//             checkNeighbor(A, B, i, j, N, M);
//             sum ++;
//         }
//     }
//  return sum;
// }