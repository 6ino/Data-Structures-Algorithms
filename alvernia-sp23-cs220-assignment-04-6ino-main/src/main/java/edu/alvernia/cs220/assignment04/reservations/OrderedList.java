public class OrderedList<E> {
    private Node head;
    private int size;

    private class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            next = null;
        }
    }

    public OrderedList() {
        head = null;
        size = 0;
    }

    public void add(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            Node currentNode = head;
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public E remove() {
        if (head == null) {
            return null;
        }
        E removedData = head.data;
        head = head.next;
        size--;
        return removedData;
    }

    public boolean contains(E e) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.data.equals(e)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public int indexOf(E e) {
        Node currentNode = head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.data.equals(e)) {
                return index;
            }
            currentNode = currentNode.next;
            index++;
        }
        return -1;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            return null;
        }
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.data;
    }
}
