#include<iostream>
#include<utility>
#include<vector>
#include<climits>
using namespace std;
int main(){
    int n, k;
    cin >> n >> k;
    vector<int> towels(n);
    for (int i = 0; i < n; i++) cin >> towels[i];
    vector<pair<int, int>> ops;
    for (int i = 0; i < k; i++){
        int max = -1, min = INT_MAX, maxi = -1, mini = -1;
        for (int j = 0; j < n; j++){
            if (towels[j] > max){
                max = towels[j];
                maxi = j;
            }
            if (towels[j] < min){
                min = towels[j];
                mini = j;
            }
        }
        if (max - min <= 1) break;
        ops.push_back(pair<int, int>(maxi + 1, mini + 1));
        towels[mini]++;
        towels[maxi]--;
    }
    int max = -1, min = INT_MAX;
    for (int i = 0; i < n; i++){
        if (towels[i] < min) min = towels[i];
        if (towels[i] > max) max = towels[i];
    }
    cout << max - min << ' ' << ops.size() << endl;
    for (int i = 0; i < ops.size(); i++) cout << ops[i].first << ' ' << ops[i].second << endl;
    return 0;
}