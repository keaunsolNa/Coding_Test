#include <bits/stdc++.h>

using namespace std;

int main() {
  ios::sync_with_stdio(false);
  cin.tie(nullptr);

  int cntCase = 1;
  while (true) {
    int n; cin >> n;
    if (n == 0) break ;

    vector<int> v(n);
    for (int i = 0; i < n; i++)
      cin >> v[i];

    int cnt = 1'000;
    for (int i = 0; i < 1'000; i++) {
      if (count(v.begin(), v.end(), 0) == n) {
        cnt = max(0, i - 1); break ;
      }

      vector<int> cache(n);
      for (int j = 0; j < n; j++)
        cache[j] = abs(v[j] - v[(j + 1) % n]);

      v = cache;
    }

    cout << "Case " << cntCase << ": ";
    if (cnt == 1'000) cout << "not attained\n";
    else cout << cnt << " iterations\n";

    cntCase++;
  }

  return 0;
}