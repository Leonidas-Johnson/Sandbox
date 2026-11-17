struct TreeNode234 {
    int keys[3];
    struct TreeNode234* children[4];
    int numChildren = 0; // 2, 3 or 4
    // to know if a node is leaf, check that all children[] are NULL

    TreeNode234(int key) {
        keys[0] = key;
        keys[1], keys[2] = 0;
    }

    struct TreeNode234* insert(TreeNode234* root, int key) {
        
    }

};