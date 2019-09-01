class Solution {
public:
    string LeftRotateString(string str, int n) {
        if (str.size() < 2) return str;
        n %= str.size();
        return str.substr(n, str.size() - n) + str.substr(0, n);
    }
};