// 8958번: OX퀴즈
#include <iostream>

using namespace std;

int main() {
    int num_of_testcase, score = 0, bonus = 0;
    cin >> num_of_testcase;
    string ox_quiz;

    while (num_of_testcase--) {
        cin >> ox_quiz;

        for (char ox : ox_quiz) {
            if (ox == 'O')
                score += ++bonus;
            else
                bonus = 0;
        }
        cout << score << endl;

        score = 0, bonus = 0;
    }

    return 0;
}