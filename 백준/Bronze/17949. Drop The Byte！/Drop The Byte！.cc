#include <iostream>
#include <map>
#include <string>

using namespace std;

map<char, long long> convert = {{'0', 0}, {'1', 1}, {'2', 2}, {'3', 3}, {'4', 4}, {'5', 5}, {'6', 6}, {'7', 7}, {'8', 8}, {'9', 9}, 
    {'a', 10}, {'b', 11}, {'c', 12}, {'d', 13}, {'e', 14}, {'f', 15}};

long long calc(string& s, int idx, int sz) {
    long long ret = 0;
    long long size = 1;

    for(int i = idx + sz - 1; i >= idx; --i) {
        ret += convert[s[i]] * size;
        size *= 16;
    }

    return ret;
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    cout.tie(nullptr);

    string str; cin >> str;
    int N; cin >> N;
    int idx = 0;
    for(int i = 0; i < N; ++i) {
        string cmd; cin >> cmd;

        if(cmd == "char") {
            cout << calc(str, idx, 2) << " ";
            idx += 2;
        }
        else if(cmd == "int") {
            cout << calc(str, idx, 8) << " ";
            idx += 8;
        }
        else {
            cout << calc(str, idx, 16) << " ";
            idx += 16;
        }
    }

    return 0;
}