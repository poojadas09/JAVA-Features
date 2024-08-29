import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinaryTree {

    // Define the TreeNode class
    static class TreeNode {
        int value;
        TreeNode left, right;

        TreeNode(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    public static void main(String[] args) {
        // Create an example binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform level order traversal and print each level on a new line
        printLevelOrder(root);
    }

    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;

        // Initialize the queue for level order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // While the queue is not empty
        while (!queue.isEmpty()) {
            // Determine the number of nodes at the current level
            int levelSize = queue.size();

            // Collect the values of the current level nodes into a string
            String levelNodes = IntStream.range(0, levelSize)
                .mapToObj(i -> {
                    TreeNode node = queue.poll();  // Remove node from the front of the queue
                    if (node.left != null) queue.offer(node.left);  // Add left child to the queue
                    if (node.right != null) queue.offer(node.right);  // Add right child to the queue
                    return node.value;  // Return node value
                })
                .map(String::valueOf)
                .collect(Collectors.joining(" "));

            // Print the nodes of the current level
            System.out.println(levelNodes);
        }
    }
}
