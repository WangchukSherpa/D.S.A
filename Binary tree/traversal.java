import java.util.*;
import java.io.*;
import java.lang.*;

class Node  
{ 
  int key; 
  Node left; 
  Node right; 
  Node(int k){
      key=k;
      left=right=null;
  }
}
 

class traversal { 
    
    public static void main(String args[]) 
    { 
        Node root=new Node(10);
    	root.left=new Node(20);
    	root.right=new Node(30);
        root.left.left=new Node(40);
        root.left.right=new Node(50);
    	root.right.right=new Node(60);
    	
    	inorder(root);  //left root right
    	System.out.println();
    	preorder(root);//root left right
    	System.out.println();
    	postorder(root);//left right root
    } 
    
    public static void inorder(Node root){
        if(root!=null){
            inorder(root.left);
            System.out.print(root.key+" ");
            inorder(root.right);    
        }
        
    } 
    public static void preorder(Node root){
        if(root!=null){
            System.out.print(root.key+" ");
            inorder(root.left);
            inorder(root.right);
        }
        
    }
    public static void postorder(Node root){
        if(root!=null){
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.key+" ");
        }
      
    }
    
} 
