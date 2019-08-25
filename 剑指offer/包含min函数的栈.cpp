class Solution {
private:
    stack<int>minS, S;
public:
    void push(int value) {
        if (minS.empty() || minS.top() >= value) minS.push(value);
        S.push(value);
    }
    void pop() {
        int cur = S.top();
        S.pop();
        if (cur == minS.top()) minS.pop();
    }
    int top() {
        return S.top();
    }
    int min() {
        return minS.top();
    }
};