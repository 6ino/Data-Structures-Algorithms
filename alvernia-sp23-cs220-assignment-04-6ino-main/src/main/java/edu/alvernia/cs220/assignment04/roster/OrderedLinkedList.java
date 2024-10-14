import java.util.Comparator;

public class OrderedLinkedList<E> implements GenericList<E> {
    private Node<E> head;
    private int size;
    private Comparator<E> comparator;

    public OrderedLinkedList(Comparator<E> comparator) {
        this.head = null;
        this.size = 0;
        this.comparator = comparator;
    }

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);

        if (head == null || comparator.compare(e, head.element) < 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node<E> current = head;
            while (current.next != null && comparator.compare(e, current.next.element) > 0) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    @Override
    public E remove() {
        if (size == 0) {
            return null;
        }

        E removedElement = head.element;
        head = head.next;
        size--;

        return removedElement;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        if (index == 0) {
            return remove();
        }

        Node<E> current = head;
        for (int i = 1; i < index; i++) {
            current = current.next;
        }

        E removedElement = current.next.element;
        current.next = current.next.next;
        size--;

        return removedElement;
    }


    @Override
    public boolean contains(E e) {
        Node<E> current = head;

        while (current != null) {
            if (comparator.compare(e, current.element) == 0) {
                return true;
            }
            current = current.next;
        }

        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int indexOf(E e) {
        int index = 0;
        Node<E> current = head;

        while (current != null) {
            if (comparator.compare(e, current.element) == 0) {
                return index;
            }
            current = current.next;
            index++;
        }

        return -1;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }

        Node<E> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current.element;
    }

    private static class Node<E> {
        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
            this.next = null;
        }
    }
}
