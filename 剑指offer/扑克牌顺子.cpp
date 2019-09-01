class Solution {
public:
    bool IsContinuous( vector<int> numbers ) {
        if (numbers.size() < 5) return false;
        int _max = 0, _min = 14;
        unordered_map<int, bool> vis;
        for (int x: numbers){
            if (!x) continue;
            if (vis[x]) return false;
            vis[x] = true;
            if (x < _min) _min = x;
            if (x > _max) _max = x;
        }
        return _max - _min < 5;
    }
};