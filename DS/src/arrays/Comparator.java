package arrays;

import java.util.Arrays;

class Comparator {
    Boolean compare(int a, int b) {
        String msg = String.format("int: a = %s, b = %s", a, b);
        System.err.println(msg);
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    Boolean compare(String a, String b) {
        String msg = String.format("string: a = %s, b = %s", a, b);
        System.err.println(msg);
        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }

    Boolean compare(int[] a, int[] b) {
        String msg = String.format("int[]: a = %s, b = %s", Arrays.toString(a), Arrays.toString(b));
        System.err.println(msg);
        if (a.length != b.length) {
            return false;

        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;

            }

        }
        return true;
    }
}


