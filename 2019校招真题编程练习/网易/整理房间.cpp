#include<iostream>
#include<vector>
#include<utility>
#include<climits>
using namespace std;
struct item{
    int a, b, x, y;
    pair<int, int> rots[4];
    item(int A, int B, int C, int D): a(A), b(B), x(C), y(D){
        rotate();
    }
private:
    void rotate(){
        rots[0].first = a, rots[0].second = b;
        for (int i = 1; i < 4; i++){
            rots[i].first = x + y - rots[i - 1].second;
            rots[i].second = y + rots[i - 1].first - x;
        }
    }
};
int distance(const pair<int, int> &a, const pair<int, int> &b){
    return (a.first - b.first) * (a.first - b.first) + (a.second - b.second) * (a.second - b.second);
}
bool judge(const pair<int, int> &a, const pair<int, int> &b, const pair<int, int> &c, const pair<int, int> &d){
    int d01 = distance(a, b), d02 = distance(a, c), d03 = distance(a, d), d12 = distance(b, c), d13 = distance(b, d), d23 = distance(c, d);
    if (!d01 || !d02 || !d03 || !d12 || !d13 || !d23) return false;
    return d01 == d03 && d12 == d01 && d12 == d23 || d02 == d12 && d12 == d13 && d02 == d03 || d01 == d02 && d01 == d13 && d13 == d23;
}
int main(){
    int n;
    cin >> n;
    vector<item> items;
    while (n--){
        int res = INT_MAX;
        for (int i = 0; i < 4; i++){
            int a, b, c, d;
            cin >> a >> b >> c >> d;
            items.emplace_back(item(a, b, c, d));
        }
        for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) for (int k = 0; k < 4; k++) for (int l = 0; l < 4; l++) if (judge(items[0].rots[i], items[1].rots[j], items[2].rots[k], items[3].rots[l]) && i + j + k + l < res){
            res = i + j + k + l;
        }
        if (res < INT_MAX) cout << res << endl;
        else cout << -1 << endl;
        items.clear();
    }
    return 0;
}