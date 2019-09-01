class Solution {
public:
    vector<int> FindNumbersWithSum(vector<int> array,int sum) {
        vector<int>res;
        for (int i = 0; i < array.size(); i++){
            auto goal_iter = lower_bound(array.begin() + i + 1, array.end(), sum - array[i]);
            if (goal_iter != array.end() && *goal_iter == sum - array[i]){
                res.emplace_back(array[i]);
                res.emplace_back(sum - array[i]);
                break;
            }
            if (goal_iter == array.begin() + i + 1 && sum - array[i] < *goal_iter) break;
        }
        return res;
    }
};