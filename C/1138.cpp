// 5347번: LCM
#include <iostream>

using namespace std;

long long int gcd(long long int a, long long int b) {
    if (b == 0) return a;
    return gcd(b, a % b);
}

long long int lcm(long long int a, long long int b) {
    return (a * b) / gcd(a, b);
}

int main() {
    long long int testcase, a, b;
    cin >> testcase;

    while (testcase--) {
        cin >> a >> b;
        cout << lcm(a, b) << endl;
    }

    return 0;
}