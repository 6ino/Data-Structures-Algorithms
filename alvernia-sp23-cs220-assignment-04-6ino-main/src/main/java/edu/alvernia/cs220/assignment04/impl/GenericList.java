public interface GenericList<E> {
    void add(E e);
    E remove();
    boolean contains(E e);
    int size();
    int indexOf(E e);
}
