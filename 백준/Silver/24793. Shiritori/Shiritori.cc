#include <iostream>
#include <set>
#include <string>
using namespace std;

set<string> st;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	string s;
	int N; cin >> N >> s;
	char l = s.back();
	st.insert(s);
	
	for (int i = 1; i < N; i++) {
		cin >> s;
		if (st.find(s) != st.end() || s[0] != l) {
			if (i & 1) cout << "Player 2 lost";
			else cout << "Player 1 lost";
			return 0;
		}
		l = s.back();
		st.insert(s);
	}

	cout << "Fair Game";
}
