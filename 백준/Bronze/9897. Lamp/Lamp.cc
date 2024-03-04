#include <bits/stdc++.h>
#define int long long
using namespace std;

struct s { string a; int b, c; };

main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL), cout.tie(NULL);

    int N, M, K; cin >> N >> M >> K;

    vector<bool> v(N+1);

    vector<s> u(M);
    for(int i=0; i<M; i++)
        cin >> u[i].a >> u[i].b >> u[i].c;

    while(K--) {
        string str; cin >> str;

        for(int i=0; i<M; i++) {
            if(str == u[i].a) {
                for(int j=u[i].b; j<=N; j+=u[i].c) v[j] = !v[j];
            }
        }
    }

    int ans = 0;

    for(int i=1; i<=N; i++)
        if(v[i]) ans++;

    cout << ans << "\n";
}