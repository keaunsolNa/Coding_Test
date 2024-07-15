#include <iostream>
#include <cctype>
using namespace std;

int main() {
	long double N, L;
	cin >> N >> L;

RE:	
	
	long double constant = 0;     
	long double first_num = 0;	  

	for (int i = 1; i < L; i++) 
    {
		constant += i;
	}
    
	first_num = (N - constant) / L;
	
	if (int(first_num) == first_num && first_num >= 0) 
    {
		for (int i = 0; i < L; i++) 
        {
			cout << int(first_num) + i << " ";
		}
	}
	else {
		if (L == 100) 
        {
			cout << "-1";
		}
		else 
        {
			L++;
			goto RE;
		}
	}

	return 0;
}