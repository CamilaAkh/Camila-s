package homework32;

public class Tree {

    Node root = null;
    private int count = 0;
    public int getCount(){
        return count;
    }

    public void insert(int n){

        Node node = new Node(n);

        if(root==null){
            root = node;
        } else  {
            Node current = root;
            Node previous = null;
            while (true){
                previous = current;
                if (n<previous.value){
                    current = current.leftNode;
                    if (current==null) {
                        previous.leftNode = node;
                        return;
                    }
                } else {
                    current = current.rightNode;
                    if (current==null) {
                        previous.rightNode = node;
                        return;
                    }
                }
            }
        }

    }

    public void CountLeaves() {
        CountLeaves(root);
    }


    void CountLeaves(Node tree) {
        if (tree == null) return;
        CountLeaves(tree.leftNode);

        if((tree.leftNode == null) && (tree.rightNode == null))
            count++;

        CountLeaves(tree.rightNode);
    }


}
