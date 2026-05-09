public class BSTInsertNode {

    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data ){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    /*static class BinaryTree{
        static int idx = -1;
        public static Node buildTree( int nodes[]){
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;

        }

    }*/
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }

        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }
        return root;
    }
    //for checking nodes inserted  right or not

    public static void inorder(Node root){
        if(root==null){
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root = null;
        for(int i=0 ; i<values.length ; i++){
            root=insert(root,values[i]);
        }

        inorder(root);
        System.out.println();
    }
}
