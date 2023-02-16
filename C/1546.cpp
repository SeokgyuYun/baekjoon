// 1546번: 평균
#include <iostream>

using namespace std;

int main() {
    int num_of_subjects, score, highest_score = 0;
    double avg_result = 0;
    cin >> num_of_subjects;

    for (int i = 0; i < num_of_subjects; i++) {
        cin >> score;
        avg_result += score;
        if (score > highest_score)
            highest_score = score;
    }
    avg_result = (avg_result / highest_score * 100) / num_of_subjects;

    cout << avg_result;

    return 0;
}