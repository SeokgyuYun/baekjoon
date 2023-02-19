// 4948번: 베르트랑 공준
#include <iostream>

using namespace std;

int main() {
    int n, cnt;
    cin >> n;
    bool prime[250000];
    for (int i = 0; i <= 250000; i++)
        prime[i] = true;

    for (int i = 2; i <= 250000; i++) {
        if (prime[i]) {
            for (int j = i * 2; j <= 250000; j += i) {
                prime[j] = false;
            }
        }
    }

    while (n != 0) {
        cnt = 0;
        for (int i = n + 1; i <= 2 * n; i++) {
            if (prime[i])
                cnt++;
        }
        cout << cnt << endl;
        cin >> n;
    }

    return 0;
}