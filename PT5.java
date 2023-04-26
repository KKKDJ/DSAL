import java.util.Scanner;

public class PT5 {
    static Scanner scanner = new Scanner(System.in);

    // Menu
    public static void main(String[] args) {
        int choice;

        BinaryTree tree = new BinaryTree();
        System.out.println("Enter number of nodes");

        int nodenum = scanner.nextInt();

        System.out.println("Enter " + nodenum + " nodes: ");

        for (int x = 0; x < nodenum; x++) {
            int elemnum = scanner.nextInt();
            tree.insert(elemnum);
        }

        System.out.println("[1] In-order Traversal");
        System.out.println("[2] Pre-order Traversal");
        System.out.println("[3] Post-order Traversal");
        System.out.println("Select option:");

        choice = scanner.nextInt();

        switch (choice) {

            case 1:
                System.out.println("In-order Traversal:");
                tree.inOrder(tree.root);
                System.out.println();
                break;

            case 2:
                System.out.println("Pre-order Traversal:");
                tree.preOrder(tree.root);
                System.out.println();
                break;

            case 3:
                System.out.println("Post-order Traversal:");
                tree.postOrder(tree.root);
                System.out.println();
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }
    }

}

class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void insert(int key) {
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);

        return root;
    }

    void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }
    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data + " ");
        }
    }
}