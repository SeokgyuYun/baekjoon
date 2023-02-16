// 1152번: 단어의 개수
#include <iostream>

using namespace std;

int main() {
    string str;
    getline(cin, str);

    int num_of_words = 1;

    for (char &word : str) {
        if (word == ' ')
            num_of_words++;
    }
    if (str[0] == ' ')
        num_of_words--;
    if (str[str.size() - 1] == ' ')
        num_of_words--;

    cout << num_of_words;

    return 0;
}