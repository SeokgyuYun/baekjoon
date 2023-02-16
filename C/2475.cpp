// 2475번: 검증수
#include <iostream>

using namespace std;

int main() {
    int num, verified_num = 0;

    for (int i = 0; i < 5; i++) {
        cin >> num;
        verified_num += num * num;
    }
    verified_num %= 10;

    cout << verified_num;

    return 0;
}