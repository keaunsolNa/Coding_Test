#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <cstdio>
#include <vector>
#include <algorithm>
#include <queue>
#include <cmath>
#include <cstring>

using namespace std;
int N, M;
pair<int, int> hole[100001];
int dotori[100001];
int Where[100001];
vector<int> ans;

void solve() {
	int fin = 0;
	for (int i = 1; i <= N; i++) {
		if (hole[i].first <= fin) continue;
		if (Where[N] != 0) break;
		for (int j = fin; j <= min(hole[i].first, N); j++) {
			if (Where[j] == 0) {
				Where[j] = hole[i].second;
			}
		}
		fin = hole[i].first;
	}
	for (int i = 1; i <= M; i++) cout << Where[dotori[i]] << " ";
}

int main() {
	cin.tie(0);
	cout.tie(0);
	cin >> N;
	for (int i = 1; i <= N; i++) {
		scanf("%d", &hole[i].first);
		hole[i].first += (i - 1);
		hole[i].second = i;
	}
	cin >> M;
	for (int i = 1; i <= M; i++) scanf("%d", &dotori[i]);
	solve();
	return 0;
}