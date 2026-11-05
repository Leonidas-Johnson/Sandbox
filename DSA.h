
// need to make each file's header .h file first
struct Node {
    int key;
    struct Node* next;
};

struct TreeNode {
    int key;
    struct TreeNode* left;
    struct TreeNode* right;
    TreeNode(int);
    struct TreeNode* insert(TreeNode*, int);
    bool isBST(TreeNode*);
};

struct TreeNode234 {
    int keys[3];
    struct TreeNode234* children[4];
    int numChildren;
    struct TreeNode234* insert(TreeNode234*, int);
};

struct TreeNodeRB {
    int key;
    struct TreeNodeRB* left;
    bool leftRed;
    struct TreeNodeRB* right;
    bool rightRed;
    struct TreeNodeRB* insert(TreeNodeRB*, int);
};

class Hash {
    int h1(int);
    int h2(int);
};

class Heap {
    TreeNode* root;
    void MAX_HEAPIFY(int[], int);
    void BUILD_MAX_HEAP(int[]);
    int HEAP_SIZE();
};
