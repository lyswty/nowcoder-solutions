#include<iostream>
#include<utility>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    cin.tie(0);
    ios::sync_with_stdio(false);
    int n;
    cin >> n;
    vector<pair<int, int>> items;
    vector<int> dp;
    for (int i = 0; i < n; i++){
        int w, l;
        cin >> w >> l;
        items.push_back(pair<int, int>(w, l));
    }
    sort(items.begin(), items.end());
    dp.push_back(items[0].second);
    for (int i = 1; i < n; i++){
        if (items[i].second >= dp.back()) dp.push_back(items[i].second);
        else *upper_bound(dp.begin(), dp.end(), items[i].second) = items[i].second;
    }
    cout << dp.size();
    return 0;
}