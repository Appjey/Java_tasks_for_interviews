package Easy.Task_5;

class main {
    private main left;
    private main right;
    public int countNodes(main root) {
        if (root == null) { return 0; }
        return 1 + countNodes(root.left) + countNodes(root.right);
    }
}