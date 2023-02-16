// 2908번: 상수
#include <iostream>

using namespace std;

int main() {
    int a, b, reverse_a, reverse_b, result;
    cin >> a >> b;

    reverse_a = a % 10 * 100 + (a % 100 / 10) * 10 + a / 100;
    reverse_b = b % 10 * 100 + (b % 100 / 10) * 10 + b / 100;

    result = reverse_a > reverse_b ? reverse_a : reverse_b;
    cout << result;

    return 0;
}