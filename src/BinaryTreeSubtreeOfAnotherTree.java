public class BinaryTreeSubtreeOfAnotherTree {

    // Node class
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Function to check identical trees
    public static boolean isIdentical(Node root, Node subRoot) {

        // Both are null
        if (root == null && subRoot == null) {
            return true;
        }

        // One is null
        if (root == null || subRoot == null) {
            return false;
        }

        // Data not same
        if (root.data != subRoot.data) {
            return false;
        }

        // Check left and right
        return isIdentical(root.left, subRoot.left)
                && isIdentical(root.right, subRoot.right);
    }

    // Function to check subtree
    public static boolean isSubtree(Node root, Node subRoot) {

        // Empty tree
        if (root == null) {
            return false;
        }

        // If data matches
        if (root.data == subRoot.data) {

            // Check complete tree
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // Search left or right
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {

        // Main Tree
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Subtree
        Node subRoot = new Node(2);

        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        // Check subtree
        if (isSubtree(root, subRoot)) {
            System.out.println("Subtree Found");
        } else {
            System.out.println("Subtree Not Found");
        }
    }
}