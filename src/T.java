public class T <K, V> {
    private K key;
    private V value;
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
}
class Util {
    public static <K, V> boolean compare(
            T<K, V> p1, T<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }
}
