#include<iostream>
#include<algorithm>
using namespace std;
int main(){
    int n, time, begin_hh, begin_mm, begin, res = 0;
    cin >> n;
    int *clock = new int[n];
    for (int i = 0; i < n; i++){
        int hh, mm;
        cin >> hh >> mm;
        clock[i] = hh * 60 + mm;
    }
    cin >> time >> begin_hh >> begin_mm;
    begin = begin_hh * 60 + begin_mm;
    for (int i = 0; i < n; i++) if (clock[i] + time <= begin && clock[i] > res) res = clock[i];
    delete[] clock;
    cout << res / 60 << ' ' << res % 60;
    return 0;
}