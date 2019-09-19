#include<iostream>
#include<string>
#include<vector>
using namespace std;
string handler(string s, int k, int n, int m){
    if (n < 0){
        if (m == 0) return s;
        else{
            while (m--) s += 'z';
            return s;
        }
    }
    long long c = 1;
    for (int C = 1; C <= n; C++){
        c *= n + m - C + 1;
        c /= C;
        if (c >= k) break;
    }
    if (k <= c) return handler(s + 'a', k, n - 1, m);
    else return handler(s + 'z', k - c, n, m - 1);
}
int main(){
    int n, m, k;
    cin >> n >> m >> k;
    long long c = 1;
    for (int C = 1; C <= n; C++){
        c *= n + m - C + 1;
        c /= C;
        if (c > k) break;
    }
    if (k > c) cout << -1;
    else cout << handler("", k, n - 1, m);
    return 0;
}