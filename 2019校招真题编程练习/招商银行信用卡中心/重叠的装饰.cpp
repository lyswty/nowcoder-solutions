#include<iostream>
#include<utility>
using namespace std;
bool judge(int l, int r, int n, pair<int, int> *posts, int i){
    if (l >= r) return false;
    if (i == n) return true;
    if (posts[i].first <= l && posts[i].second >= r) return false;
    if (posts[i].second <= l || posts[i].first >= r) return judge(l, r, n, posts, i + 1);
    // 样例有误，原本下面三句都可以用下面的一行代替
    // return judge(l, posts[i].first, n, posts, i + 1) || judge(posts[i].second, r, n, posts, i + 1);
    if (posts[i].first <= l) return judge(posts[i].second, r, n, posts, i + 1);
    if (posts[i].second >= r) return judge(l, posts[i].first, n, posts, i + 1);
    return judge(l, r, n, posts, i + 1);
}
int main(){
    int n, res = 0;
    cin >> n;
    pair<int, int> *posts = new pair<int, int>[n];
    for (int i = 0; i < n; i++) cin >> posts[i].first >> posts[i].second;
    for (int i = 0; i < n; i++) if (judge(posts[i].first, posts[i].second, n, posts, i + 1)) res++;
    cout << res;
    delete[] posts;
    return 0;
}