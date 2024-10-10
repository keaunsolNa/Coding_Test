#include <stdio.h>
typedef long long ll;
ll a[100004];
int n;

int A(ll a1)
{
    int count = 0;
    for (int i = 0; i < n; i++) if (a[i] >= a1) count++;
    return count;
}

int B(ll b)
{
    int count = 0;
    for (int i = 0; i < n; i++) if (a[i] > b) count++;
    return count;
}

int C(ll c1, ll c2)
{
    int count = 0;
    for (int i = 0; i < n; i++) if (a[i] >= c1 && a[i] <= c2) count++;
    return count;
}

int main()
{
    int m;

    scanf("%d %d", &n, &m);
    for (int i = 0; i < n; i++) scanf("%lld", &a[i]);

    for (int i = 0; i < m; i++)
    {
        int op;
        scanf("%d", &op);
        if (op == 1)
        {
            ll x;
            scanf("%lld", &x);
            printf("%d\n", A(x));
        }
        else if (op == 2)
        {
            ll x;
            scanf("%lld", &x);
            printf("%d\n", B(x));
        }
        else
        {
            ll x, y;
            scanf("%lld %lld", &x, &y);
            printf("%d\n", C(x, y));
        }
    }
}