// 2562번: 최댓값
#include <iostream>

using namespace std;

int main() {
    int num, max_num = 0, idx_of_max_num;

    for (int i = 1; i <= 9; i++) {
        cin >> num;
        if (num > max_num) {
            max_num = num;
            idx_of_max_num = i;
        }
    }

    cout << max_num << endl << idx_of_max_num;

    return 0;
}