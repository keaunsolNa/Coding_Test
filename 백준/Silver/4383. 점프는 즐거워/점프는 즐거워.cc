#include <iostream>
#include <string>
#include <map>
#include <algorithm>
#include <cmath>
using namespace std;

int n;
int main(void){
    while(cin >> n){
        int arr[3001];
        for(int i = 0;i<n;i++){
            cin >> arr[i];
        }
    
        map<int,int> m;
        map<int,int>::iterator iter;
        
        bool isvalid = false;
        
        for(int i = 0;i<n-1;i++){ 
            int diff = abs(arr[i] - arr[i+1]);
            iter = m.find(diff);
            if(iter == m.end()){
                m.insert({diff,diff});
            }
        }
       
       bool indexs[3001] = {false, };
        
       for(iter = m.begin();iter != m.end();iter++){
           int N = iter->second;
           indexs[N] = true;
 
           
       }

        
        for(int i = 1;i<=n-1;i++){
            if(indexs[i] == false){
                isvalid = true;
                break;
            }
        }
        
        if(isvalid == false || n == 1){
            cout << "Jolly" << '\n';
        }
        else{
            cout << "Not jolly" << '\n';
        }
    }
}