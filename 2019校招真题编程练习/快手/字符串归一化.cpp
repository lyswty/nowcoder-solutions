#include<iostream>
#include<string>
#include<memory.h>
using namespace std;
int main(){
    string s;
    cin >> s;
    int frequency[26];
    memset(frequency, 0, sizeof(frequency));
    for (char ch: s) frequency[ch - 'a']++;
    s.clear();
    for (int i = 0; i < 26; i++) if (frequency[i]){
        s += 'a' + i;
        s += to_string(frequency[i]);
    }
    cout << s;
    return 0;
}