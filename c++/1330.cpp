// 1330번: 두 수 비교하
#include <iostream>

using namespace std;

int main() {
    int a, b;
    cin >> a >> b;

    cout << (a > b ? ">" : a == b ? "==" : "<");

    return 0;
}