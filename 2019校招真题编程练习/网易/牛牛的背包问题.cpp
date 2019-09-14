#include<iostream>
#include<queue>
#include<utility>
#include<algorithm>
#include<cmath>
using namespace std;
int main(){
    int n, w, res = 0;
    cin >> n >> w;
    int *v = new int[n];
    long long sum = 0;
    for (int i = 0; i < n; i++){
        cin >> v[i];
        sum += v[i];
    }
    if (sum <= w){
        cout << (int)pow(2, n);
        return 0;
    }
    sort(v, v + n);
    queue<pair<int, int>> q;
    q.push(pair<int, int>(0, 0));
    while (q.size()){
        auto cur = q.front();
        q.pop();
        res++;
        for (int i = cur.first; i < n && (long long)cur.second + v[i] <= w; i++) q.push(pair<int, int>(i + 1, cur.second + v[i]));
    }
    delete[] v;
    cout << res;
    return 0;
}