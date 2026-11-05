#include <iostream>
// #include <iomanip>
#include <string>
// #include <unordered_map>
#include "Node.cpp"
#include "TreeNode.h"

using namespace std;

class Heap {
    public:

    TreeNode * root;


    void MAX_HEAPIFY(int A[], int i) {
        if (i <= HEAP_SIZE(A) && A[left] > A[i]) {
            left = largest;
        }
        else {
            largest = i;
        }
        if (r <= HEAP_SIZE(A) && A[right] > A[largest]) {
            largest = right;
        }
        if (largest != i) {
            int temp = A[i];
            A[i] = A[largest];
            A[largest] = temp;
            MAX_HEAPIFY(A, largest);
        }

        void BUILD_MAX_HEAP(int A[]) {
            for (int i = 0; i < A.length(); i++) {
                MAX_HEAPIFY(A, i);
            }
        }

        int HEAP_SIZE() {
            return 1;
        }
    }

    
};

/*

              --------------20--------------
      -------2------                  ------10------
 ---7---         ---18---           9               5             
4       12      1       7       
*/