class Solution {
public:
    void reOrderArray(vector<int> &array) {
        if (array.empty()) return;
        mergesort(array, 0, array.size() - 1);
    }
    void mergesort(vector<int> &array, int start, int end){
        if (start >= end) return;
        int mid = (start + end) / 2;
        mergesort(array, start, mid);
        mergesort(array, mid + 1, end);
        merge(array, start, mid, mid + 1, end);
    }
    void merge(vector<int> &array, int left_begin, int left_end, int right_begin, int right_end){
        vector<int> left(array.begin() + left_begin, array.begin() + left_end + 1);
        vector<int> right(array.begin() + right_begin, array.begin() + right_end + 1);
        int l = 0, r = 0, cur = left_begin;
        while (l < left.size() && r < right.size()){
            if (left[l] % 2) array[cur++] = left[l++];
            else if (right[r] % 2) array[cur++] = right[r++];
            else array[cur++] = left[l++];
        }
        while (l < left.size()) array[cur++] = left[l++];
        while (r < right.size()) array[cur++] = right[r++];
    }
};