#include <iostream>
using namespace std;

int rewards[4];
int N, d;
int curTime, curPoint;
int deltaTime = 4, deltaPoint = 1;

void endGame()
{
    int targetPoint = 35;

    int point = curPoint;

    curTime = 0;
    curPoint = 0;
    deltaPoint = 1;
    deltaTime = 4;

    if (point >= targetPoint)
    {
        for (int i = 0; i < 3; ++i)
        {
            if (point < targetPoint + 30 * (i + 1))
            {
                ++rewards[i];
                return;
            }
        }
        ++rewards[3];
    }
    else
    {
        return;
    }
}

void roll()
{
    cin >> d;

    switch (d)
    {
    case 1:
        endGame();
        return;
    case 2:
        if (deltaPoint > 1)
        {
            deltaPoint /= 2;
        }
        else if (deltaPoint == 1)
        {
            deltaTime += 2;
        }
        break;
    case 4:
        curTime += 56;
        break;
    case 5:
        if (deltaTime > 1)
        {
            deltaTime -= 1;
        }
        break;
    case 6:
        if (deltaPoint < 32)
        {
            deltaPoint *= 2;
        }
        break;
    }

    curTime += deltaTime;
    curPoint += deltaPoint;
}

int main()
{
    ios::sync_with_stdio(0), cin.tie(0);

    cin >> N;
    while (N--)
    {
        if (curTime > 240)
        {
            endGame();
        }

        roll();
    }

    for (int &reward : rewards)
    {
        cout << reward << "\n";
    }
    return 0;
}