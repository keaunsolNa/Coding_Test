#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool cmp(vector<long long> u, vector<long long> t);

vector<vector<long long>> v;

int main()
{
	
	ios::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);

	int n, k;
	cin >> n >> k;
	v.resize(n, vector<long long>(3));

	for (int i = 0; i < n; i++) {
		cin >> v[i][2] >> v[i][1] >> v[i][0]; 
	}

	sort(v.begin(), v.end(), cmp);

	for (int i = 0; i < k; i++) {
		cout << v[i][2] << "\n";
	}

	return 0;
}

bool cmp(vector<long long> u, vector<long long> t) {
	long long g1 = u[0] * t[1];
	long long g2 = t[0] * u[1];
	if (g1 == g2) {
		if (u[1] == t[1])
			return u[2] < t[2];
		else
			return u[1] < t[1];
	}
	return g1 > g2;
}