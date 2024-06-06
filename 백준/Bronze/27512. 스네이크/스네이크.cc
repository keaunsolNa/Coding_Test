#include <iostream>
using namespace std;
int main(){
    ios::sync_with_stdio(false), cin.tie(NULL);
    register int N, M;
    cin >> N >> M;
    if(N & 1){
        if(M & 1)
            cout << N * M - 1;
        else
            cout << N * M;
    }
    else
        cout << N * M;
	return 0;
}