import java.util.LinkedList;
import java.util.Queue;

public class Implementation {

    static class Node{
        int data;
        Node left;
        Node right ;
        Node(int data){
            this.data= data;
            this.left=null;
            this.right=null;

        }
    }

    static class BinaryTree{
        static int idx=-1;

        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newnode= new Node(nodes[idx]);
            newnode.left=buildTree(nodes);
            newnode.right=buildTree(nodes);
            return newnode;
        }
        public void Preorder(Node root){
            if (root==null){
                return;
            }
            System.out.print(root.data+ " ");
            Preorder(root.left);
            Preorder(root.right);
        }
        public void Inorder(Node root){
            if (root==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+ " ");

            Inorder(root.right);
        }
        public void Postorder(Node root){
            if (root==null){
                return;
            }
            Postorder(root.left);
            Postorder(root.right);
            System.out.print(root.data+ " ");


        }

        public void LevelOrder (Node root){
            Queue<Node> q= new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node current = q.poll();
                if (current == null) {
                    if (q.isEmpty()) {
                        return;
                    }
                    q.add(null);
                    System.out.println();
                } else {
                    System.out.print(current.data + " ");
                    if (current.left != null) {
                        q.add(current.left);
                    }
                    if (current.right != null) {
                        q.add(current.right);
                    }
                }
            }
        }

        public  int CountOfnodes(Node root){
            if (root==null){
                return 0;
            }
            int leftNode=CountOfnodes(root.left);
            int rightNode=CountOfnodes(root.right);
            return leftNode+rightNode+1;
        }
        public int SumOfnodes(Node root){
            if (root==null){
                return 0;
            }
            int leftSum=SumOfnodes(root.left);
            int rightSum=SumOfnodes(root.right);
            return leftSum+rightSum+root.data;
        }

        public int Height(Node root){
            if (root==null){
                return 0;
            }
            return Math.max(Height(root.left), Height(root.right))+1;

        }
        public int diameter(Node root){
            if (root==null){
                return 0;
            }
            int dia1=diameter(root.left);
            int dia2=diameter(root.right);
            int dia3=  Height(root.left)+ Height(root.right)+1;
            return Math.max(dia3, Math.max(dia1, dia2));
        }
    }


    public static void main(String[] args) {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println("Preorder");
        tree.Preorder(root);
        System.out.println();
        System.out.println("Inorder");
        tree.Inorder(root);

        System.out.println();
        System.out.println("Post order");
        tree.Postorder(root);

        System.out.println();
        System.out.println("level order");
        tree.LevelOrder(root);

        System.out.println();
        System.out.println("Total number of nodes: ");
        System.out.print(tree.CountOfnodes(root));

        System.out.println();
        System.out.println("SUm number of nodes: ");
        System.out.print(tree.SumOfnodes(root));

        System.out.println();
        System.out.println("Height 0f Tree: ");
        System.out.print(tree.Height(root));

        System.out.println();
        System.out.println("Diameter 0f Tree: ");
        System.out.println(tree.diameter(root));


    }
}
