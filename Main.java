public class Main {
    public static void main(String[] args) {
        int [] a = {56,78,34,45,86,56,3,7,8,55,43,45,44,67};
        Tree tree = new Tree();
        for(int i = 0; i < a.length; i++){
            tree.insert(a[i]);
        }
        tree.print();
        Node b = tree.search(46);

        if(b!=null)System.out.println(b.getValue());
        else System.out.println("Value isn't presented");
    }
}
