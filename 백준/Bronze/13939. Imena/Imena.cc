#include<bits/stdc++.h>
using namespace std;
int main(){
	int n;
	cin >> n;
	int ans = 0;
	while(true){
		string s;
		cin >> s;
		if(cin.eof()) break;
		bool isEnd = (s.back() == '.' || s.back() == '!' || s.back() == '?');
		if(isEnd) s.pop_back();
		bool flag = true;
		if(!isupper(s[0]))
			flag = false;
		for(int i=1; i<s.size(); ++i)
			if(!islower(s[i]))
				flag = false;
		ans += flag;
		if(isEnd){
			cout << ans << '\n';
			ans = 0;
		}
	}
}