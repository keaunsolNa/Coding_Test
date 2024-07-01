#include <iostream>
#include <vector>
#include <string>
#include <iomanip>
#include <sstream>
#include <algorithm>

using namespace std;

// Function to calculate factorial
string factorial(int n) {
    vector<int> result(1, 1);

    for (int i = 2; i <= n; ++i) {
        int carry = 0;
        for (size_t j = 0; j < result.size(); ++j) {
            int prod = result[j] * i + carry;
            result[j] = prod % 10;
            carry = prod / 10;
        }
        while (carry) {
            result.push_back(carry % 10);
            carry /= 10;
        }
    }

    ostringstream oss;
    for (auto it = result.rbegin(); it != result.rend(); ++it) {
        oss << *it;
    }
    return oss.str();
}

int main() {
    string input;
    stringstream ss;
    while (getline(cin, input)) {
        int n = stoi(input);
        string fac = factorial(n);
        int ans = 0;

        for (int i = fac.length() - 1; i >= 0; --i) {
            if (fac[i] != '0') {
                ans = fac[i] - '0';
                break;
            }
        }

        ss << setw(5) << n << " -> " << ans << "\n";
    }
    cout << ss.str();

    return 0;
}