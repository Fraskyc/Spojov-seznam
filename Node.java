public class Node {
    int data;       // uložená hodnota
    Node next;      // odkaz na další uzel

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}
