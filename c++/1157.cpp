// 1157번: 단어 공부
#include <iostream>

using namespace std;

int alphabet[26];

int main() {
    string word;
    cin >> word;

    for (char alpha : word) {
        if (alpha < 97)
            alphabet[alpha - 65]++;
        else
            alphabet[alpha - 97]++;
    }

    int max_alpha = 0;
    int max_alpha_idx;
    for (int i = 0; i < 26; i++) {
        if (alphabet[i] > max_alpha) {
            max_alpha = alphabet[i];
            max_alpha_idx = i;
        }
    }

    int distinct = 0;
    for (int alpha : alphabet) {
        if (max_alpha == alpha)
            distinct++;
    }

    cout << (distinct > 1 ? '?' : (char)(max_alpha_idx + 65));

    return 0;
}