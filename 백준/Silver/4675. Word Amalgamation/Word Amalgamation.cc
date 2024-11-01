#include <bits/stdc++.h>
#define int long long
using namespace std;

main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL), cout.tie(NULL);

    map<string, set<string>> m;

    while(true) {
        string str; cin >> str;
        if(str == "XXXXXX") break;

        string tmp = str;

        sort(tmp.begin(), tmp.end());

        m[tmp].insert(str);
    }

    while(true) {
        string str; cin >> str;
        if(str == "XXXXXX") break;

        sort(str.begin(), str.end());

        if(m[str].empty()) cout << "NOT A VALID WORD\n";
        else {
            for(auto i : m[str]) cout << i << "\n";
        }

        cout << "******\n";
    }
}