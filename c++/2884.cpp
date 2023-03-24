// 2884번: 알람 시계
#include <iostream>

using namespace std;

int main() {
    int hour, minute;
    cin >> hour >> minute;

    hour = minute - 45 < 0 ? hour == 0 ? 23 : hour - 1 : hour;
    minute = minute - 45 < 0 ? minute + 15 : minute - 45;

    cout << hour << ' ' << minute;

    return 0;
}