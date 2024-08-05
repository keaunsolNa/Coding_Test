#include <iostream>
using namespace std;
string plain, password, answer;
int main()
{
    ios::sync_with_stdio(0), cin.tie(0);

    cin >> plain >> password;

    int size = plain.size();

    answer.reserve(size);

    for (int i = 0; i < size; ++i)
    {
        int ch = ((password[i] - plain[i] + 26) % 26);

        if (ch == 0)
        {
            answer.push_back('Z');
        }
        else
        {
            answer.push_back(ch + 64);
        }
    }

    for (int i = 1; i <= size / 2; ++i)
    {
        if (size % i)
        {
            continue;
        }

        string repeatStr = answer.substr(0, i);
        string temp = "";

        while (temp.size() != size)
        {
            temp += repeatStr;
        }

        if (temp == answer)
        {
            cout << repeatStr;
            return 0;
        }
    }

    cout << answer;
    return 0;
}