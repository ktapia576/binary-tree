class Node {
     String value = "I am node";
     int val;

     Node left;
     Node right;

     Node(int value){
          this.val = value;
     }
}


public class BinaryTree {
     Node root;

     public static void main(String[] args) {
          Node root = new Node(10);

          addRecursive(root, 9);
          inOrderPrint(root);

          //spacer for inOrder print
          System.out.println();
          System.out.println("Test");
          System.out.println(root.value);
     }

     private static Node addRecursive(Node current, int value) {
          if(current == null) {
               return new Node(value);
          }

          if(value < current.val){
               current.left = addRecursive(current.left, value);
          }
          else if(value > current.val){
               current.right = addRecursive(current.right, value);
          }
          else {
               //value exists
               return current;
          }

          return current;
     }

     /**
      * Prints binary tree in order. Passing the root as initial argument is recommended.
      *
      * @param current holds the current node in the traversal
      */
     private static void inOrderPrint(Node current){
          if(current == null){
               return;
          }

          inOrderPrint(current.left);
          System.out.print(current.val + " ");
          inOrderPrint(current.right);
     }
}
