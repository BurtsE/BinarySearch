import java.util.Comparator;
import java.util.List;

public class Collections {
    public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T key) {
        int l = 0;
        int r = list.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = list.get(m).compareTo(key);
            if (res == 0) {
                return m;
            } else if (res < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        int l = 0;
        int r = list.size() - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = c.compare(list.get(m), key);
            if (res == 0) {
                return m;
            } else if (res < 0) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }
}
