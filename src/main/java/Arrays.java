import java.util.Comparator;

public class Arrays {
    public static int binarySearch(byte[] a, byte key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        int l = fromIndex;
        int r = toIndex - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(char[] a, char key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        int l = fromIndex;
        int r = toIndex - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(double[] a, double key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        int l = fromIndex;
        int r = toIndex - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(float[] a, float key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(float[] a, int fromIndex, int toIndex, float key) {
        int l = fromIndex;
        int r = toIndex - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(int[] a, int key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(int[] a, int fromIndex, int toIndex, int key) {
        int l = fromIndex;
        int r = toIndex - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(long[] a, long key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(long[] a, int fromIndex, int toIndex, long key) {
        int l = fromIndex;
        int r = toIndex - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(short[] a, short key) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static int binarySearch(short[] a, int fromIndex, int toIndex, short key) {
        int l = fromIndex;
        int r = toIndex - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] < key) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return -(r + 1) - 1;
    }

    public static <T> int binarySearch(T[] a, T key, Comparator<T> c) {
        int l = 0;
        int r = a.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = c.compare(a[m], key);
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

    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<T> c) {
        int l = fromIndex;
        int r = toIndex - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = c.compare(a[m], key);
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
