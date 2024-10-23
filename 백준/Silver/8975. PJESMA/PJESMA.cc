#include <bits/stdc++.h>
#define int long long
using namespace std;

main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL), cout.tie(NULL);

    int N; cin >> N;

    set<string> s;

    for(int i=0; i<N; i++) {
        string str; cin >> str;

        s.insert(str);
    }

    int M; cin >> M;

    vector<string> v(M);

    for(int i=0; i<M; i++) cin >> v[i];

    unordered_map<string, bool> m;
    int cnt = 0;

    for(int i=0; i<M; i++) {
        if(m[v[i]]) continue;

        m[v[i]] = true;

        if(s.count(v[i]) > 0) cnt++;

        if(cnt >= (N+1)/2) {
            cout << i+1 << "\n";
            break;
        }
    }
}