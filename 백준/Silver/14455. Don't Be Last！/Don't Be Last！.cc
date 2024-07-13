#include <bits/stdc++.h>
using namespace std;
 
int N;
map<string, int> c2m;
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    cin >> N;
    while(N--) {
        string name;
        int milk;
        cin >> name >> milk;
        c2m[name] += milk;
    }
 
    int M = 1e9;
    for(auto it = c2m.begin(); it != c2m.end(); it++)
        M = min(M, it->second);
    if(c2m.size() < 7) M = 0;
 
    int MM = 1e9;
    for(auto it = c2m.begin(); it != c2m.end(); it++) {
        if(it->second == M) continue;
        MM = min(MM, it->second);
    }
 
    int cnt = 0;
    string ans = "";
    for(auto it = c2m.begin(); it != c2m.end(); it++) {
        if(it->second == MM) {
            cnt++;
            ans = it->first;
        }
    }
 
    if(cnt == 1) cout << ans << '\n';
    else cout << "Tie" << '\n';
    return 0;
}