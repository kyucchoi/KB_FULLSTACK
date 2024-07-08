package generic.ex3;

public class Pair<T, K> {
    public T value;
    public K key;

    public Pair(T value, K key) {
        this.value = value;
        this.key = key;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "value=" + value +
                ", key=" + key +
                '}';
    }
}
