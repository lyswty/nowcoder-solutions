#include<iostream>
#include<cstring>
#include<climits>
using namespace std;
int main(){
    int n, m, res = INT_MAX;
    cin >> n >> m;
    int *col = new int[n];
    memset(col, sizeof(col), 0);
    while (m--){
        int cur;
        cin >> cur;
        col[cur - 1]++;
    }
    for (int i = 0; i < n; i++) if (res > col[i]) res = col[i];
    delete[] col;
    cout << res;
    return 0;
}