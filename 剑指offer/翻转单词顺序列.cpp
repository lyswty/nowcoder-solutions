class Solution {
public:
    string ReverseSentence(string str) {
        stringstream ss(str);
        vector<string> string_list;
        string cur;
        while (ss >> cur) string_list.emplace_back(cur);
        if (string_list.empty()) return str;
        cur = string_list.back();
        for (int i = (int)string_list.size() - 2; i >= 0; i--){
            cur += ' ';
            cur += string_list[i];
        }
        return cur;
    }
};