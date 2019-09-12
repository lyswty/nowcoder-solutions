#include<iostream>
#include<string>
using namespace std;
int main(){
    int n, l = 0;
    string s;
    cin >> n >> s;
    for (char x: s) {
        if (x == 'L') l++;
        else l--;
    }
    if (l < 0) l = -l + 2;
    l %= 4;
    switch (l){
        case 0: cout << 'N' << endl; break;
        case 1: cout << 'W' << endl; break;
        case 2: cout << 'S' << endl; break;
        default: cout << 'E' << endl;
    }
    return 0;
}