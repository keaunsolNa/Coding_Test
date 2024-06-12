#include <iostream>
#include <algorithm>
#include <string>
using namespace std;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0); cout.tie(0);

	char reflect[9] = { 'b', 'd', 'p', 'q', 'i','o','v','w','x'};

	while (true) {
        
		string str;
		cin >> str;
		if (str == "#") break; 
        
		int len = str.length();
		string result = "";
        
		for (int i = 0; i < len; i++) {
            
			if (*find(begin(reflect), end(reflect), str[i]) != str[i]) {
				result = "INVALID";
				break;
			}
            
			else {
                
				if (str[i] == 'b') result += 'd';
				else if (str[i] == 'd') result += 'b';
				else if (str[i] == 'p') result += 'q';
				else if (str[i] == 'q') result += 'p';
				else result += str[i];

            }

        }
        
		if (result != "INVALID") {
			for (int i = len - 1; i >= 0; i--) {
				cout << result[i];
			}
			cout << '\n';
		}
		else {
			cout << result << '\n';
		}

	}
}