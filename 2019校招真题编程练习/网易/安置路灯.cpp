#include<iostream>
#include<string>
using namespace std;
int main(){
    int t;
    cin >> t;
    while (t--){
        int n, i = 0, res = 0;
        string s;
        cin >> n >> s;
        while (i < s.size()){
            if (s[i] == '.'){
                res++;
                i += 3;
            }
            else i++;
        }
        cout << res << endl;
    }
    return 0;
}