// 2739번: 구구단
#include <iostream>

using namespace std;

int main() {
    int dan;
    cin >> dan;
    for (int n = 1; n <= 9; n++)
        cout << dan << " * " << n << " = " << dan * n << endl;

    return 0;
}