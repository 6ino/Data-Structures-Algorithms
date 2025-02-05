public class Party {
    private String name;
    private int size;

    public Party(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Party{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
