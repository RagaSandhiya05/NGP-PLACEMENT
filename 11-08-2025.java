1.//Binart trees - Inorder , Preorder , Postorder , levelorder
import java.util.*;
class BinaryTree
{
    class Node{
        int data;
        Node left,right;
        Node(int data)
        {
            this.data=data;
            left=right=null;
        }
    }
    public Node root = null;
    void insert(int data)
    {
        root = insertAA(root, data);
    }
    Node insertAA(Node root, int data)
    {
        if(root == null)
        {
            root = new Node(data);
            return root;
        }
        if(root.data > data)
        {
            root.left = insertAA(root.left, data);
        }
        else if(root.data < data)
        {
            root.right = insertAA(root.right, data);
        }
        return root;
    }
    void inorder(Node root)
    {
        if(root == null)
            return;
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    void preorder(Node root)
    {
        if(root == null)
            return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root)
    {
        if(root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    
    void levelorder(Node root)
    {
        if (root == null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(! q.isEmpty())
        {
            Node temp = q.poll();
            System.out.print(temp.data+" ");
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
    }
    
}
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BinaryTree tree = new BinaryTree();
		tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(40);
        tree.insert(5);
        tree.insert(6);
        tree.insert(7);
        System.out.print("Inorder :" + " ");
        tree.inorder(tree.root);
        System.out.println(" ");
        System.out.print("Preorder :" + " ");
        tree.preorder(tree.root);
        System.out.println(" ");
        System.out.print("Postorder :" + " ");
        tree.postorder(tree.root);
        System.out.println(" ");
        System.out.print("Levelorder :" + " ");
        tree.levelorder(tree.root);
        System.out.println(" ");
	}
}

//Output
Inorder : 1 2 3 5 6 7 40  
Preorder : 1 2 3 40 5 6 7  
Postorder : 7 6 5 40 3 2 1  
Levelorder : 1 2 3 40 5 6 7  
