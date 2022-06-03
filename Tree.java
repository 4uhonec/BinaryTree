public class Tree {
    private static Node _root;
    public Tree(){
        _root = null;
    }

    public void addNode(int num){
        if(_root == null){

        }
    }

    public static Node search(int num){
        return search(_root, num);
    }

    public static Node search(Node root, int num){
        if(root == null) return null;
        if(root.getValue() == num) return root;
        if(root.getValue() > num) return search(root.getLeftChild(), num);
        else return search(root.getRightChild(), num);
    }

    public static void insert(int num){
        if(_root == null){
            _root = new Node(num);
            return;}
        insert(_root, num);
    }

    public static void insert(Node node, int num){
        if(node.getValue() < num){
            if(node.getRightChild() == null) node.setRightChild(new Node(num));
            else insert(node.getRightChild(), num);
        }
        else{
            if(node.getLeftChild() == null) node.setLeftChild(new Node(num));
            else insert(node.getLeftChild(), num);
        }
    }

    public static void print(){
        print(_root);
    }
    public static void print(Node n){
        if(n != null){
            print(n.getLeftChild());
            System.out.print(n.getValue() + " ");
            print(n.getRightChild());
        }
    }

    public static void delete(int num){
        Node node = search(num);

    }

    private static Node findParent(int num){
        return findParent(_root, num);
    }

    private static Node findParent(Node root, int num){
        if
    }
}
