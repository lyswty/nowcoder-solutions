#include<iostream>
using namespace std;
int main(){
    long n, k, cnt = 0;
    cin >> n >> k;
    for (int i = k + 1; i <= n; i++){
        cnt += n / i * (i - k);
        if (n - n / i * i >= k) cnt += n - n / i * i - k + 1;
        if (!k) cnt--;
    }
    cout << cnt;
    return 0;
}