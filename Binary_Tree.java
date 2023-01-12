import java.util.Scanner;

public class Binary_Tree{
    private class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);

    public Binary_Tree(){
        root=create_BTree();
    }
    private Node create_BTree(){
        int item=sc.nextInt();
        Node nn=new Node();

        nn.val=item; 
        boolean hlc=sc.nextBoolean();
        if(hlc){
            nn.left=create_BTree();
        }
        boolean hrc=sc.nextBoolean();
        if(hrc){
            nn.right=create_BTree();
        }

        return nn;
    }

    private void display(Node node){
        if(node==null){
            return;
        }
        String s="";
        s+=node.val;
        s="<-"+s+"->";
        if(node.left!=null){
            s=node.left.val+s;
        }
        else{
            s="."+s;
        }
        if(node.right!=null){
            s=s+node.right.val;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        display(node.left);
        display(node.right);

    }

    public void display() {
        display(root);
    }
}
