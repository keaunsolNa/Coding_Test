#include <iostream>
#include <string>
#include <vector>
#include <algorithm>
using namespace std;

int T;
bool comp(string& s1, string& s2) {
	int idx1 = 0, idx2 = 0;
	while (idx1 < s1.length() && idx2 < s2.length()) {
		if (s1[idx1] == s2[idx2]) idx1++, idx2++;
		else {
			if (s1[idx1] == '-') return 0;
			if (s2[idx2] == '-') return 1;
			if (tolower(s1[idx1]) != tolower(s2[idx2])) return tolower(s1[idx1]) < tolower(s2[idx2]);
			return s1[idx1] < s2[idx2];
		}
	}
	return s1 < s2;
}

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> T;
	while (T--) {
		int N; cin >> N;
		vector<string> vec;
		while (N--) {
			string s; cin >> s;
			vec.emplace_back(s);
		}
		sort(vec.begin(), vec.end(), comp);

		for (auto& s : vec) cout << s << '\n';
	}
}