#include<iostream>
#include<vector>
#include<string>
#include<sstream>
using namespace std;
typedef struct node{
    int val, sum;
    node *left, *right;
    node(int x): val(x), left(NULL), right(NULL), sum(0){}
}*tree;
vector<int> res;
tree reconstruct(const vector<int> &pre_order, const vector<int> &in_order, int pre_start, int pre_end, int in_start, int in_end){
    if (pre_start > pre_end) return NULL;
    tree root = new node(pre_order[pre_start]);
    int root_index = in_start;
    while (in_order[root_index] != pre_order[pre_start]) root_index++;
    int left_in_end = root_index - 1, left_in_start = in_start, right_in_start = root_index + 1, right_in_end = in_end;
    int left_pre_start = pre_start + 1, left_pre_end = left_pre_start + left_in_end - left_in_start, right_pre_start = left_pre_end + 1, right_pre_end = pre_end;
    root->left = reconstruct(pre_order, in_order, left_pre_start, left_pre_end, left_in_start, left_in_end);
    root->right = reconstruct(pre_order, in_order, right_pre_start, right_pre_end, right_in_start, right_in_end);
    return root;
}
void post_dfs(tree root){
    if (!root) return;
    post_dfs(root->left);
    post_dfs(root->right);
    if (root->left) root->sum += root->left->sum + root->left->val;
    if (root->right) root->sum += root->right->sum + root->right->val;
}
void in_dfs(tree root){
    if (!root) return;
    in_dfs(root->left);
    res.push_back(root->sum);
    in_dfs(root->right);
}
int main(){
    string pre, in;
    getline(cin, pre);
    getline(cin, in);
    stringstream ss(pre);
    int cur;
    vector<int> pre_order, in_order;
    while (ss >> cur) pre_order.push_back(cur);
    ss.clear();
    ss.str(in);
    while (ss >> cur) in_order.push_back(cur);
    tree T = reconstruct(pre_order, in_order, 0, pre_order.size() - 1, 0, pre_order.size() - 1);
    post_dfs(T);
    in_dfs(T);
    cout << res[0];
    for (int i = 1; i < res.size(); i++) cout << ' ' << res[i];
    return 0;
}