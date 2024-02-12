#include <iostream>
#include <string>
#define ll long long
using namespace std;

bool able(string s)
{
    ll num = 0;
    for (char c : s)
    {
        num *= 10;
        num += c - '0';
    }
    if (num <= 641) return true;
    return false;
}

int main(void)
{
    ios_base::sync_with_stdio(false); cin.tie(NULL);
    ll N, i, cnt = 0;
    string s;

    cin >> N >> s;
    for (i = 0; i < N; i++)
    {
        if ((i + 3 == N || (i + 3 < N && s[i + 3] != '0')) && able(s.substr(i, 3))) i += 2;
        else if ((i + 2 == N || (i + 2 < N && s[i + 2] != '0')) && able(s.substr(i, 2))) i += 1;
        cnt++;
    }
    cout << cnt;
}