// 2675번: 문자열 반복
#include <iostream>

using namespace std;

int main() {
    int num_of_testcase, num_of_iterations;
    cin >> num_of_testcase;
    string str;

    while (num_of_testcase--) {
        cin >> num_of_iterations >> str;
        for (char alpha : str) {
            for (int i = 0; i < num_of_iterations; i++)
                cout << alpha;
        }
        cout << '\n';
    }

    return 0;
}