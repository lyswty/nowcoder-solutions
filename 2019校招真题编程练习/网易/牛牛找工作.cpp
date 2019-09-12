#include<iostream>
#include<algorithm>
#include<utility>
#include<climits>
using namespace std;
int main(){
	int n, m;
	scanf("%d%d", &n, &m);
	pair<int, int> *jobs = new pair<int, int>[n];
	for (int i = 0; i < n; i++) scanf("%d%d", &jobs[i].first, &jobs[i].second);
    sort(jobs, jobs + n);
	int *b = new int[n];
    b[0] = jobs[0].second;
    for (int i = 1; i < n; i++) b[i] = max(b[i - 1], jobs[i].second);
	for (int i = 0; i < m; i++){
		int cur, res = 0;
		scanf("%d", &cur);
        int index = upper_bound(jobs, jobs + n, pair<int, int>(cur, INT_MAX)) - jobs - 1;
		printf("%d\n", b[index]);
	}
	return 0;
}