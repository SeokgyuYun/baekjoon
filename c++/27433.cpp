// 27433번: 팩토리얼 2
#include <iostream>

using namespace std;

int main() {
    long long int N, result;
    cin >> N;
    result = N;
    if (N == 0) {
        result = 1;
    } else {
        while (--N)
            result *= N;
    }
    cout << result;

    return 0;
}