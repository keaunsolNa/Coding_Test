#include <bits/stdc++.h>
using namespace std;
 
int N, order[101];
string id[101];
 
int main() {
    ios_base::sync_with_stdio(0);
    cin.tie(0);
 
    cin >> N;
    for(int i = 1; i <= N; i++) cin >> order[i];
    for(int i = 1; i <= N; i++) cin >> id[i];
 
    for(int i = 1; i <= N; i++)
        cout << id[order[order[order[i]]]] << '\n';
    return 0;
}