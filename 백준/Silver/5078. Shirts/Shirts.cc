#include <bits/stdc++.h>
#define int long long
using namespace std;

bool cmp(string a, string b) {
    if(a[0] != b[0]) {
        if(a[0] == 'S') return true;
        else if(b[0] == 'S') return false;
        else if(a[0] == 'M') return true;
        else return false;
    }
    return a[1] < b[1];
}

main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL), cout.tie(NULL);

    while(true) {
        int N; cin >> N;
        if(N == 0) break;

        vector<string> v;

        while(N--) {
            string str; cin >> str;

            v.push_back(str);
        }

        int M; cin >> M;

        while(M--) {
            string str; cin >> str;

            v.push_back(str);
        }

        sort(v.begin(), v.end(), cmp);

        for(int i=0; i<v.size(); i++) cout << v[i] << " ";
        cout << "\n";
    }
}