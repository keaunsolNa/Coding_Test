#include <iostream>
using namespace std;

int T, N;
int arr[1000];

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);

	cin >> T;
	while (T--) {
		cin >> N;
		int cnt2 = 0;
		for (int i = 0; i < N; i++) {
			int& cur = arr[i]; cin >> cur;
			if (cur > 1) cnt2++;
		}

		if (cnt2 & 1) cout << -1 << '\n';
		else {
			if (cnt2) {
				cnt2 /= 2;
				for (int i = 0; i < N; i++) {
					if (arr[i] > 1) {
						cnt2--;
						if (!cnt2) {
							cout << i + 1 << '\n';
							break;
						}
					}
				}
			}
			else cout << 1 << '\n';
		}
	}
}