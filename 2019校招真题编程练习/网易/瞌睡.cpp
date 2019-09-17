#include<iostream>
using namespace std;
int main(){
    int n, k, res = 0;
    cin >> n >> k;
    int *interest = new int[n], *wake = new int[n];
    for (int i = 0; i < n; i++) cin >> interest[i];
    for (int i = 0; i < n; i++){
        cin >> wake[i];
        if (wake[i]) res += interest[i];
    }
    int window = res;
    for (int i = 0; i < n && i < k; i++) if (!wake[i]) window += interest[i];
    res = window;
    for (int i = 1; i + k <= n; i++) {
        if (!wake[i - 1]) window -= interest[i - 1];
        if (!wake[i + k - 1]) window += interest[i + k - 1];
        if (window > res) res = window;
    }
    delete[] interest, wake;
    cout << res;
    return 0;
}