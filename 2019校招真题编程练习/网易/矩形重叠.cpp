#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n, res = 0;
    cin >> n;
    vector<int> x1(n), x2(n), y1(n), y2(n);
    for (int i = 0; i < n; i++) cin >> x1[i];
    for (int i = 0; i < n; i++) cin >> y1[i];
    for (int i = 0; i < n; i++) cin >> x2[i];
    for (int i = 0; i < n; i++) cin >> y2[i];
    for (int x : x1) for (int y: y1){
        int cnt = 0;
        for (int i = 0; i < n; i++) if (x >= x1[i] && x < x2[i] && y >= y1[i] && y < y2[i]) cnt++;
        if (cnt > res) res = cnt;
    }
    cout << res;
    return 0;
}