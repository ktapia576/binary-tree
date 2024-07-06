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

          System.out.println("Test");
          System.out.println(root.value);
     }

     private static Node addRecursive(Node current, int value) {
          if(current == null) {
               return new Node(value);
          }




          return current;
     }
}
