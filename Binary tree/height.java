class Node{
    Node left,right;
    int key;
    Node(int k){
    key=k;
    left=right=null;
    }
}
class BinaryTreeheight{
    Node root;
      
    int maxHeight(Node node){
        if(node==null){
            return -1;
     }
     else
     {
        int maxl=maxHeight(node.left);
        int maxr=maxHeight(node.right);
        if(maxl>maxr)
        return maxl+1;
        else
        return maxr+1;
     }
    }
    public static void main(String[] args) {
        BinaryTreeheight tree=new BinaryTreeheight();
        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.left.left=new Node(4);
       System.out.println(tree.maxHeight(tree.root)); 
    }
    

    }
