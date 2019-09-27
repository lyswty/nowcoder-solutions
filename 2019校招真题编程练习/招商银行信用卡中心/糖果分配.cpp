#include<iostream>
#include<sstream>
#include<vector>
#include<string>
#include<algorithm>
#include<functional>
using namespace std;
int main(){
    string input;
    getline(cin, input);
    vector<int> g, s;
    int cur;
    istringstream ss(input);
    while (ss >> cur) g.push_back(cur);
    getline(cin, input);
    ss.clear();
    ss.str(input);
    while (ss >> cur) s.push_back(cur);
    sort(g.begin(), g.end(), greater<int>());
    sort(s.begin(), s.end(), greater<int>());
    cur = 0;
    int i = 0, j = 0;
    while (i < s.size() && j < g.size() && s[i] < g[j]) j++;
    while (i < s.size() && j < g.size()){
        if (s[i] >= g[j]){
            cur++;
            i++;
            j++;
        }
        else j++;
    }
    cout << cur;
    return 0;
}