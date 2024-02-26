#include <iostream>

using namespace std;
using numtype = unsigned long long int;

int main() {
  int n;

  cin >> n;
  numtype start = n;
  numtype end = 2*n;

  while(start <= end) {
    numtype middle = start/2 + end/2; //
    numtype result = middle - (middle/3 + middle/5 - middle/15);

    if(result == n) {
      if(middle % 3 == 0 || middle % 5 == 0 ) {
          if((middle-1) %3 == 0 || (middle-1) % 5 ==0) {
              cout << middle-2 << "\n";
          }
          else
            cout << middle -1 << "\n";
      } else {
        cout << middle << "\n";
      }
      return 0;
    }

    if(result < n)
      start = middle;
    else
      end = middle;

  }
}