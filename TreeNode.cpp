#include "TreeNode.h"
#include "DSA.h"

struct TreeNode {
    int key;
    struct TreeNode* left;
    struct TreeNode* right;

    TreeNode(int key): key(key) {}

    // BST insertion
    struct TreeNode* insert(struct TreeNode* node, int key) {
        /* If the tree is empty, return a new node */
        if (node == nullptr) {
            return new TreeNode(key);
        }
        /* Otherwise, recur down the tree */
        if (key < node->key)
            node->left = insert(node->left, key);
        else if (key > node->key)
            node->right = insert(node->right, key);
    
        /* return the (unchanged) node pointer */
        return node;

    }

    // Assumed no duplicate values, always a full binary tree
    // HW5 naive BST check
    bool isBST(TreeNode* node) {
        if (node->left == nullptr && node->right == nullptr) {
            return true;
        }
        else if (node->left->key < node->key && node->key < node->right->key) {
            return true;
        }
        else {
            return false;
        }
    }
};

