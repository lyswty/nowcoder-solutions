#include<iostream>
#include<sstream>
#include<string>
#include<vector>
using namespace std;
int main(){
    string input;
    cin >> input;
    stringstream ss(input);
    string cur;
    vector<int> nums;
    while (getline(ss, cur, ',')) nums.emplace_back(stoi(cur));
    vector<int> dp(nums.size());
    if (nums.size()) dp[0] = nums[0];
    if (nums.size() > 1) dp[1] = nums[1];
    for (int i = 2; i < nums.size(); i++) dp[i] = min(dp[i - 2], dp[i - 1]) + nums[i];
    cout << min(dp.back(), dp[dp.size() - 2]);
    return 0;
}