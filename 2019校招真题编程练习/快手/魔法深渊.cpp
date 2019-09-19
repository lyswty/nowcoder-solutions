#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    int n;
    cin >> n;
    long long *dp = new long long[1001];
    fill(dp, dp + 1001, 0);
    dp[0] = 1, dp[1] = 1;
    for (int i = 2; i < 1001; i++) for (int j = 0; i - (int)pow(2, j) >= 0; j++){
        dp[i] += dp[i - (int)pow(2, j)];
        dp[i] %= 1000000003LL;
    }
    while (n--){
        int x;
        cin >> x;
        cout << dp[x] << endl;
    }
    delete[] dp;
    return 0;
}