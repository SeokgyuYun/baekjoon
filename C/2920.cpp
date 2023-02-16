// 2920번: 음계
#include <iostream>

using namespace std;

int main() {
    int note = 0, cnt = 0;
    string scale;

    for (int i = 1; i <= 8; i++) {
        cin >> note;
        if (note == i)
            cnt++;
        else if (note == 9 - i)
            cnt--;
    }

    switch (cnt) {
        case 8: scale = "ascending"; break;
        case -8: scale = "descending"; break;
        default: scale = "mixed";
    }

    cout << scale;

    return 0;
}