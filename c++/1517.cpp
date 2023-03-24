// 1517번: 버블 소트
#include <iostream>

using namespace std;

long long cnt = 0;
int arr[500000];
int sorted[500000];

void merge(int start, int mid, int end) {
    int i = start, j = mid + 1, k = start;

    while (i <= mid && j <= end) {
        if (arr[i] <= arr[j])
            sorted[k++] = arr[i++];
        else {
            cnt += j - k;
            sorted[k++] = arr[j++];
        }
    }
    if (i > mid) {
        for (int t = j; t <= end; t++)
            sorted[k++] = arr[t];
    } else {
        for (int t = i; t <= mid; t++)
            sorted[k++] = arr[t];
    }

    for (int t = start; t <= end; t++)
        arr[t] = sorted[t];
}


void merge_sort(int start, int end) {
    if (start < end) {
        int mid = (start + end) / 2;

        merge_sort(start, mid);
        merge_sort(mid + 1, end);

        merge(start, mid, end);
    }
}

int main() {
    int N;
    cin >> N;
    for (int i = 0; i < N; i++) {
        cin >> arr[i];
    }
    merge_sort(0, N - 1);
    cout << cnt;

    return 0;
}