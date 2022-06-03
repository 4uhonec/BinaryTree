public class Node {
    private int _num;
    private Node _leftChild;
    private Node _rightChild;

    public Node(int num){
        _num = num;
        _leftChild = null;
        _rightChild = null;
    }

    public Node getRightChild(){
        return _rightChild;
    }

    public Node getLeftChild(){
        return _leftChild;
    }

    public void setLeftChild(Node node){
        _leftChild = node;
    }

    public void setRightChild(Node node){
        _rightChild = node;
    }

    public int getValue(){
        return _num;
    }
}
