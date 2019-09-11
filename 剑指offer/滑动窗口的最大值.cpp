class Solution {
public:
    vector<int> maxInWindows(const vector<int>& num, unsigned int size)
    {
        multiset<int> window;
        vector<int> res;
        if (!size || size > num.size()) return res;
        for (int i = 0; i < size; i++) window.insert(num[i]);
        res.emplace_back(*window.rbegin());
        for (int i = 1; i + size <= num.size(); i++){
            window.erase(window.find(num[i - 1]));
            window.insert(num[i + size - 1]);
            res.emplace_back(*window.rbegin());
        }
        return res;
    }
};