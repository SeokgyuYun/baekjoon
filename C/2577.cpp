// 2577번: 숫자의 개수
#include <iostream>

using namespace std;

int nums[10];

int main() {
    int a, b, c, mul_of_nums;
    cin >> a >> b >> c;
    mul_of_nums = a * b * c;

    for (char num : to_string(mul_of_nums))
        nums[num - 48]++;

    for (int i = 0; i < 10; i++)
        cout << nums[i] << endl;

    return 0;
}