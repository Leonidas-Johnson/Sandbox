using namespace std;

struct TreeNode {
    int key;
    struct TreeNode* left;
    struct TreeNode* right;
    TreeNode(int);
    struct TreeNode* insert(TreeNode*, int);
    bool isBST(TreeNode*);
};