public class Main {
    public static void main(String[] args) {
        RedBlackTree<Integer> node = new RedBlackTree();

        node.insert(1);
        node.inorder();
        System.out.println("\n");
        node.insert(2);
        node.inorder();
        System.out.println("\n");
        node.insert(3);
        node.inorder();
        System.out.println("\n");
        node.insert(-33);
        node.inorder();
        System.out.println("\n");
        node.insert(-64);
        node.inorder();
        System.out.println("\n");
        node.insert(-743);
        node.inorder();
        System.out.println("\n");
        node.insert(-4434);
        node.inorder();
        System.out.println("\n");
        node.insert(-443434);
        node.inorder();


    }
}
