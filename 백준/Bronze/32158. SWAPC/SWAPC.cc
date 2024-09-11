#include <iostream>
using namespace std;
int N, cCount, pCount;
string S, answer;

int main()
{
    cin >> N >> S;

    for (char c : S)
    {
        if (c == 'P')
        {
            ++pCount;
        }
        else if (c == 'C')
        {
            ++cCount;
        }
    }

    pCount = min(pCount, cCount);
    cCount = pCount;

    for (char c : S)
    {
        if (c == 'P' && pCount)
        {
            --pCount;
            answer.push_back('C');
        }
        else if (c == 'C' && cCount)
        {
            --cCount;
            answer.push_back('P');
        }
        else
        {
            answer.push_back(c);
        }
    }

    cout << answer;
    return 0;
}