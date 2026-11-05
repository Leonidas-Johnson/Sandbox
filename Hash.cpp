#include <iostream>
#include <string>
#include <unordered_map>

using namespace std;

int h1 (int key) {
    int x = ( key + 7) * (key + 7);
    x = x / 16; //ditch the remainder
    x = x + key;
    x = x % 11; // x mod 11
    return x;
}

int h2 (int key) {
    return h1(key) + 1;
}

int main() {
    cout << "Hello, World!" << endl;

    unordered_map<int, int> hashmap;

    int nums[] = {43, 23, 1, 0, 15, 31, 4};

    int hashes[7];
    for (int i = 0; i < 7; i++) {
        hashes[i] = h1(nums[i]);
        cout << "Number: " << nums[i] << "\n";
        cout << "Hash: " << hashes[i] << endl;
    }

    // Result: (43, 1), (23, 2), (1, 5), (0, 3), (15, 1), (31, 0), (4, 0)
    // 0: 31
    // 1: 43
    // 2: 23
    // 3: 0
    // 4: null
    // 5: 1
    // (15,1) and (4, 0) Will be discarded


    // With linear probing
    // 0: 31
    // 1: 43
    // 2: 23
    // 3: 0
    // 4: 15
    // 5: 1
    // 6: 4



    return 0;
}