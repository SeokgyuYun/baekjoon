// 1003번: 피보나치 함수
#include <iostream>

using namespace std;

int main() {
    int num_of_testcase, num;
    int zero_and_one[41] = {0, 1, 1};

    for (int i = 3; i < 41; i++)
        zero_and_one[i] = zero_and_one[i - 1] + zero_and_one[i - 2];

    cin >> num_of_testcase;

    while (num_of_testcase--) {
        cin >> num;
        switch (num) {
            case 0: cout << 1 << ' ' << 0 << endl; break;
            case 1: cout << 0 << ' ' << 1 << endl; break;
            default: cout << zero_and_one[num - 1] << ' ' << zero_and_one[num] << endl;
        }
    }

    return 0;
}