// 25304번: 영수증
#include <iostream>

using namespace std;

int main() {
    int X, N, a, b, price = 0;
    cin >> X >> N;
    while (N--) {
        cin >> a >> b;
        price += a * b;
    }
    cout << (price == X ? "Yes" : "No");
    return 0;
}