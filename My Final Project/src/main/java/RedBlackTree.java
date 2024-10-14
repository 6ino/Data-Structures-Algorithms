import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Comparator;
public class RedBlackTree<K extends Comparable<K>, V> {
    private enum Color {
        RED, BLACK
    }

    private static class Node<K, V> {
        K key;
        V value;
        Node<K, V> left;
        Node<K, V> right;
        Node<K, V> parent;
        Color color;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
            this.color = Color.RED;
            this.left = null;
            this.right = null;
            this.parent = null;
        }
    }

    private Node<K, V> root;

    public RedBlackTree() {
        root = null;
    }

    public void insert(K key, V value) {
        Node<K, V> newNode = new Node<>(key, value);
        root = insert(root, newNode);
        root.color = Color.BLACK;
    }

    private Node<K, V> insert(Node<K, V> node, Node<K, V> newNode) {
        if (node == null) {
            return newNode;
        }

        newNode.parent = node;

        if (newNode.key.compareTo(node.key) < 0) {
            node.left = insert(node.left, newNode);
        } else if (newNode.key.compareTo(node.key) > 0) {
            node.right = insert(node.right, newNode);
        } else {
            node.value = newNode.value;
            return node;
        }

        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }

        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }

        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }

    public V search(K key) {
        Node<K, V> node = search(root, key);
        return node != null ? node.value : null;
    }

    private Node<K, V> search(Node<K, V> node, K key) {
        if (node == null) {
            return null;
        }

        int cmp = key.compareTo(node.key);
        if (cmp < 0) {
            return search(node.left, key);
        } else if (cmp > 0) {
            return search(node.right, key);
        } else {
            return node;
        }
    }

    public Iterable<K> keys() {
        List<K> keys = new ArrayList<>();
        keys(root, keys);
        return keys;
    }

    private void keys(Node<K, V> node, List<K> keys) {
        if (node == null) {
            return;
        }

        keys(node.left, keys);
        keys.add(node.key);
        keys(node.right, keys);
    }

    private boolean isRed(Node<K, V> node) {
        return node != null && node.color == Color.RED;
    }

    private Node<K, V> rotateLeft(Node<K, V> node) {
        Node<K, V> right = node.right;
        node.right = right.left;
        right.left = node;

        right.color = node.color;
        node.color = Color.RED;

        return right;
    }

    private Node<K, V> rotateRight(Node<K, V> node) {
        Node<K, V> left = node.left;
        node.left = left.right;
        left.right = node;

        left.color = node.color;
        node.color = Color.RED;
        return left;
    }

    private void flipColors(Node<K, V> node) {
        node.color = Color.RED;
        node.left.color = Color.BLACK;
        node.right.color = Color.BLACK;
    }

    public List<V> searchBy(Predicate<K> predicate) {
        List<V> result = new ArrayList<>();
        searchByHelper(root, predicate, result);
        return result;
    }

    private void searchByHelper(Node<K, V> node, Predicate<K> predicate, List<V> result) {
        if (node == null) {
            return;
        }

        searchByHelper(node.left, predicate, result);

        if (predicate.test(node.key)) {
            result.add(node.value);
        }

        searchByHelper(node.right, predicate, result);
    }

    public List<V> searchBySubjects(Predicate<String> predicate) {
        List<V> result = new ArrayList<>();
        searchBySubjectsHelper(root, predicate, result);
        return result;
    }

    private void searchBySubjectsHelper(Node<K, V> node, Predicate<String> predicate, List<V> result) {
        if (node == null) {
            return;
        }

        searchBySubjectsHelper(node.left, predicate, result);

        if (predicate.test(((BookRecord) node.value).getSubjects())) {
            result.add(node.value);
        }

        searchBySubjectsHelper(node.right, predicate, result);
    }

    //newimps
    public List<V> searchByAuthor(String authorName) {
        List<V> result = new ArrayList<>();
        searchByAuthorHelper(root, authorName, result);
        return result;
    }

    private void searchByAuthorHelper(Node<K, V> node, String authorName, List<V> result) {
        if (node == null) {
            return;
        }

        searchByAuthorHelper(node.left, authorName, result);

        if (node.value instanceof BookRecord) {
            BookRecord record = (BookRecord) node.value;
            List<String> authorsAndYears = record.getAuthorsAndYears();
            for (String authorAndYear : authorsAndYears) {
                if (authorAndYear.contains(authorName)) {
                    result.add(node.value);
                    break;
                }
            }
        }

        searchByAuthorHelper(node.right, authorName, result);
    }

    //new imp2
    public List<V> searchByAuthorBirthDeathDate(int birthYear, int deathYear) {
        List<V> result = new ArrayList<>();
        searchByAuthorBirthDeathDateHelper(root, birthYear, deathYear, result);
        return result;
    }

    private void searchByAuthorBirthDeathDateHelper(Node<K, V> node, int birthYear, int deathYear, List<V> result) {
        if (node == null) {
            return;
        }

        searchByAuthorBirthDeathDateHelper(node.left, birthYear, deathYear, result);

        if (node.value instanceof BookRecord) {
            BookRecord record = (BookRecord) node.value;
            List<String> authorsAndYears = record.getAuthorsAndYears();
            for (String authorAndYear : authorsAndYears) {
                if (record.authorBornInOrDiedIn(authorAndYear, birthYear, deathYear)) {
                    result.add(node.value);
                    break;
                }
            }
        }

        searchByAuthorBirthDeathDateHelper(node.right, birthYear, deathYear, result);
    }

    public List<V> searchByAuthorBirthDateRange(int startYear, int endYear) {
        List<V> result = new ArrayList<>();
        searchByAuthorBirthDateRangeHelper(root, startYear, endYear, result);
        return result;
    }

    private void searchByAuthorBirthDateRangeHelper(Node<K, V> node, int startYear, int endYear, List<V> result) {
        if (node == null) {
            return;
        }

        searchByAuthorBirthDateRangeHelper(node.left, startYear, endYear, result);

        if (node.value instanceof BookRecord) {
            BookRecord record = (BookRecord) node.value;
            List<String> authorsAndYears = record.getAuthorsAndYears();
            for (String authorAndYear : authorsAndYears) {
                if (record.authorBornBetween(authorAndYear, startYear, endYear)) {
                    result.add(node.value);
                    break;
                }
            }
        }

        searchByAuthorBirthDateRangeHelper(node.right, startYear, endYear, result);
    }

    public List<V> searchByAuthorDeathDateRange(int startYear, int endYear) {
        List<V> result = new ArrayList<>();
        searchByAuthorDeathDateRangeHelper(root, startYear, endYear, result);
        return result;
    }

    private void searchByAuthorDeathDateRangeHelper(Node<K, V> node, int startYear, int endYear, List<V> result) {
        if (node == null) {
            return;
        }

        searchByAuthorDeathDateRangeHelper(node.left, startYear, endYear, result);

        if (node.value instanceof BookRecord) {
            BookRecord record = (BookRecord) node.value;
            List<String> authorsAndYears = record.getAuthorsAndYears();
            for (String authorAndYear : authorsAndYears) {
                if (record.authorDiedBetween(authorAndYear, startYear, endYear)) {
                    result.add(node.value);
                    break;
                }
            }
        }

        searchByAuthorDeathDateRangeHelper(node.right, startYear, endYear, result);
    }
    //new imp
}