public class Node<T> {
    private T value;
    private Node<T> next;

    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setNext(Node<T> next) {
        this.next = next;

    }

    public void setValue(T value) {
        this.value = value;
    }


    public Node<T> getNext() {
        return next;
    }


}
