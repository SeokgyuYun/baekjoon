// 3052번: 나머지
#include <iostream>
#include <set>

using namespace std;

int main() {
    int num;
    set<int> result;

    for (int i = 0; i < 10; i++) {
        cin >> num;
        result.insert(num % 42);
    }

    cout << result.size();

    return 0;
}