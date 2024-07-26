#include <bits/stdc++.h>


int t, m;
std::string n;

void ipv8ToNum(std::string & s){
    std::stringstream ss;
    ss.str(s);
    std::string str;
    unsigned long long number = 0;
    while(std::getline(ss, str, '.')){
        number <<= 8;
        unsigned char part = (unsigned char)std::stoi(str);
        number |= part;
    }
    std::cout << number << "\n";
}

void numToIpv8(std::string & s){
    std::string str;
    unsigned long long number = std::stoull(s);
    unsigned long long flag = 0xFF00000000000000;
    for (int i = 7; i >= 0; --i){
        unsigned char ch = ((number & flag) >> 8 * i);
        flag = flag >> 8;
        str += std::to_string(ch);
        str += '.';
    }
    str.pop_back();
    std::cout << str << "\n";
}


int main()
{
    std::ios_base::sync_with_stdio(false);
    std::cin.tie(nullptr);
    std::cin >> t;
    while(t--){
        std::cin >> m >> n;
        if (m == 1){
            ipv8ToNum(n);
        }
        else {
            numToIpv8(n);
        }
    }
    return 0;
}