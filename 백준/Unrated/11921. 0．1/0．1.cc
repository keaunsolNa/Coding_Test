#include <cstdio>
using namespace std;

char a[50000000];

int main()
{
    int N = 0, i, temp;
    long long sum = 0;

    fread(a, 1, sizeof(a), stdin);

    for (i = 0; a[i] != '\n'; i++) {
        N = N * 10 + (a[i] - 0x30);
    }
    printf("%d\n", N);

    while (N--) {
        temp = 0;
        for (i++; a[i] != '\n'; i++) {
            temp = temp * 10 + (a[i] - 0x30);
        }
        sum += temp;
    }

    printf("%lld\n", sum); 
    return 0;
}