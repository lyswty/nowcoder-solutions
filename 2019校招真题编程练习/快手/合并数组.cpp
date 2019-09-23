#include<iostream>
#include<sstream>
#include<string>
#include<algorithm>
#include<vector>
using namespace std;
int main(){
    string input;
    cin >> input;
    stringstream ss(input);
    input.clear();
    string cur;
    vector<int> v1, v2, res;
    while (getline(ss, cur, ',')) v1.push_back(stoi(cur));
    cin >> input;
    ss.clear();
    ss.str(input);
    while (getline(ss, cur, ',')) v2.push_back(stoi(cur));
    res.resize(v1.size() + v2.size());
    merge(v1.begin(), v1.end(), v2.begin(), v2.end(), res.begin());
    if (res.size()) cout << res[0];
    for (int i = 1; i < res.size(); i++) cout << ',' << res[i];
    return 0;
}