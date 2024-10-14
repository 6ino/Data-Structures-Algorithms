public class ReservationQueue implements GenericList<Party> {
    private OrderedList<Party> list;

    public ReservationQueue() {
        list = new OrderedList<>();
    }

    @Override
    public void add(Party party) {
        list.add(party);
    }

    @Override
    public Party remove() {
        return list.remove();
    }

    @Override
    public boolean contains(Party party) {
        return list.contains(party);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public int indexOf(Party party) {
        return list.indexOf(party);
    }
}
