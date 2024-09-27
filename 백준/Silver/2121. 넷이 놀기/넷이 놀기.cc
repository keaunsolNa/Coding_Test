#include <iostream>
#include <map>
 
using namespace std;
 
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(0);
 
    int n;
    cin >> n;
 
    int a, b;
    cin >> a >> b;
 
    
    map<const pair<long long, long long>, int> m;
    long long _a, _b;
    for (int i = 0; i < n; i++)
    {
        cin >> _a >> _b;
        m[{_a, _b}]++;
    }
 
    map<const pair<long long, long long>, int>::iterator iter = m.begin();
 
    int cnt = 0;
    for (; iter != m.end(); iter++)
    {
        pair<long long, long long> dot1 = { (iter->first).first + a, (iter->first).second };
        pair<long long, long long> dot2 = { (iter->first).first, (iter->first).second + b };
        pair<long long, long long> dot3 = { (iter->first).first + a, (iter->first).second + b };
 
        auto temp = m.find(dot3);
 
        if (m.find(dot1) != m.end()
            && m.find(dot2) != m.end()
            && m.find(dot3) != m.end())
        {
            cnt++;
        }
    }
 
    cout << cnt;
 
    return 0;
}
 
