#define _CRT_SECURE_NO_WARNINGS
#include <string>
#include <stdio.h>
#include <math.h>
#include <iostream>
#include <vector>
#include <algorithm>
#include <map>
#include <queue>
#include <stack>
#include <time.h>
#define INF 100000000
#define endl '\n'
#define ll long long

using namespace std;

pair<ll, pair<ll, ll>> xGCD(ll a, ll b) { // returns {g, {x, y}}, ax+by=g
	if(b==0) return { a,{1,0} }; // base case
	pair<ll, pair<ll, ll>> ret=xGCD(b, a%b);
	ll g, x, y;
	g=ret.first;
	tie(x, y)=ret.second;
	return { g,{y,x-(a/b)*y} }; 
}

ll f(ll x, ll n, ll mod) {
	if(n==0) return 1;
	if(n==1) return x % mod;
	if(n%2==0) {
		ll res=f(x, n/2, mod) % mod;
		res = res * res;
		return res % mod;
	}
	else {
		ll res=f(x, n/2, mod) % mod;
		res = (res * res) % mod;
		return (x * res) % mod;
	}
}

int main()
{
	ios_base::sync_with_stdio(false); cin.tie(0); cout.tie(0);

	ll m, seed, x1, x2;
	cin>>m>>seed>>x1>>x2;

	if(x1==seed) {
		ll a=0, c=x1;
		cout<< 0 <<" "<<x1;
	}
	else {
		ll a, c;
		a = (x2 - x1) % m;
		a = a < 0 ? a + m : a;
		a = (a * f(x1-seed<0?x1-seed+m:x1-seed, m-2, m)) % m;
		c = (x2 - a * x1)%m;
		c = c < 0 ? c + m : c;
		cout<<a <<" " << c;
	}
	

	return 0;
}