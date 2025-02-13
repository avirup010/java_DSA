class AVLNode {
    int key, height;
    AVLNode left, right;

    public AVLNode(int key) {
        this.key = key;
        this.height = 1;
    }
}

class AVLTree {
    AVLNode root;

    int height(AVLNode node) {
        return node == null ? 0 : node.height;
    }

    int balanceFactor(AVLNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    AVLNode rotateRight(AVLNode y) {
        AVLNode x = y.left;
        AVLNode T2 = x.right;
        x.right = y;
        y.left = T2;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        return x;
    }

    AVLNode rotateLeft(AVLNode x) {
        AVLNode y = x.right;
        AVLNode T2 = y.left;
        y.left = x;
        x.right = T2;
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        return y;
    }

    AVLNode insert(AVLNode node, int key) {
        if (node == null) return new AVLNode(key);

        if (key < node.key) node.left = insert(node.left, key);
        else if (key > node.key) node.right = insert(node.right, key);
        else return node;

        node.height = Math.max(height(node.left), height(node.right)) + 1;

        int balance = balanceFactor(node);
        if (balance > 1 && key < node.left.key) return rotateRight(node);
        if (balance < -1 && key > node.right.key) return rotateLeft(node);
        if (balance > 1 && key > node.left.key) {
            node.left = rotateLeft(node.left);
            return rotateRight(node);
        }
        if (balance < -1 && key < node.right.key) {
            node.right = rotateRight(node.right);
            return rotateLeft(node);
        }
        return node;
    }

    void insert(int key) {
        root = insert(root, key);
    }
}

class SegmentTree {
    int[] segTree, arr;
    int n;

    SegmentTree(int[] arr) {
        this.arr = arr;
        this.n = arr.length;
        segTree = new int[4 * n];
        build(0, 0, n - 1);
    }

    void build(int node, int start, int end) {
        if (start == end) {
            segTree[node] = arr[start];
        } else {
            int mid = (start + end) / 2;
            build(2 * node + 1, start, mid);
            build(2 * node + 2, mid + 1, end);
            segTree[node] = segTree[2 * node + 1] + segTree[2 * node + 2];
        }
    }

    int query(int node, int start, int end, int l, int r) {
        if (r < start || l > end) return 0;
        if (l <= start && end <= r) return segTree[node];
        int mid = (start + end) / 2;
        return query(2 * node + 1, start, mid, l, r) + query(2 * node + 2, mid + 1, end, l, r);
    }

    int rangeQuery(int l, int r) {
        return query(0, 0, n - 1, l, r);
    }
}

public class ComplexDSA {
    public static void main(String[] args) {
        AVLTree avl = new AVLTree();
        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);

        int[] arr = {1, 3, 5, 7, 9, 11};
        SegmentTree st = new SegmentTree(arr);
        System.out.println("Sum of range (1, 3): " + st.rangeQuery(1, 3));
    }
}
