#include <iostream>
#include <sstream>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;

    while (t--) {
        long long l, r, s;
        cin >> l >> r >> s;

        long long idx = 1;
        long long ans = 1;

        for (int i = 0; ; i++) {
            if (s == l || s == r) break;

            if (i % 2 == 0) s += idx++;
            else s -= idx++;

            ans++;
        }

        cout << ans << '\n';
    }

    return 0;
}
