package Easy.Task_5;


import org.w3c.dom.Node;

public class main {
    public void traverse(Node child){ // post order traversal
        int count() {
            Tree l = getLeftTree();
            Tree r = getRightTree();
            return 1 + (l != null ? l.count() : 0) + (r != null ? r.count() : 0);
        }
    }
}
