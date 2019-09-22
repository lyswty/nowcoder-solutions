#include<iostream>
#include<vector>
using namespace std;
int main(){
    ios::sync_with_stdio(false);
    cin.tie(0);
    int n, m, sum = 0;
    cin >> n >> m;
    vector<int> food;
    while (n--){
        int cur;
        cin >> cur;
        if (sum > 0 && cur < 0 || sum < 0 && cur >= 0){
            food.push_back(sum);
            sum = cur;
        }
        else sum += cur;
    }
    if (sum > 0) food.push_back(sum);
    sum = 0;
    if (m > food.size()){
        for (int x: food) if (x > 0) sum += x;
    }
    else{
        int k, h;
        vector<vector<int>> dp(2, vector<int>(food.size() + 1, 0));
        for (int i = 1; i <= m; i++) {
            int cur = 0;
            k = i & 1, h = (i - 1) & 1;
            dp[k][0] = 0;
            for (int j = 0; j < food.size(); j++) {
                cur = max(cur, dp[h][j]);
                dp[k][j + 1] = max(cur, dp[k][j]) + food[j];
            }
        }
        for (int i = m; i <= food.size(); i++) if (sum < dp[k][i]) sum = dp[k][i];
    }
    cout << sum;
    return 0;
}