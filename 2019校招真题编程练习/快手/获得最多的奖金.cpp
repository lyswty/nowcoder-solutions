#include<iostream>
using namespace std;
int main(){
    int n;
    cin >> n;
    int *cash = new int[n];
    for (int i = 0; i < n; i++) cin >> cash[i];
    int left = 0, right = n - 1;
    long res = 0, left_cash = cash[left], right_cash = cash[right];
    while (left < right){
        if (left_cash < right_cash) left_cash += cash[++left];
        else if (left_cash > right_cash) right_cash += cash[--right];
        else{
            res = left_cash;
            left_cash += cash[++left];
        }
    }
    delete[] cash;
    cout << res;
    return 0;
}