class MathUtil {
    static int power(int b, int e) {
        int r = 1;
        for (int i = 0; i < e; i++) r *= b;
        return r;
    }

    static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) if (n % i == 0) return false;
        return true;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
class StringUtil {
    static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    static boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    static int countVowels(String s) {
        int c = 0;
        for (char ch : s.toLowerCase().toCharArray())
            if ("aeiou".indexOf(ch) != -1) c++;
        return c;
    }

    static String removeDuplicates(String s) {
        String r = "";
        for (char ch : s.toCharArray())
            if (!r.contains(ch + "")) r += ch;
        return r;
    }
}
class ArrayUtil {
    static void sort(int[] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = i + 1; j < a.length; j++)
                if (a[i] > a[j]) {
                    int t = a[i]; a[i] = a[j]; a[j] = t;
                }
    }

    static int search(int[] a, int k) {
        for (int i = 0; i < a.length; i++) if (a[i] == k) return i;
        return -1;
    }

    static int findMax(int[] a) {
        int m = a[0];
        for (int i : a) if (i > m) m = i;
        return m;
    }

    static int findMin(int[] a) {
        int m = a[0];
        for (int i : a) if (i < m) m = i;
        return m;
    }

    static void reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int t = a[i]; a[i] = a[a.length - 1 - i]; a[a.length - 1 - i] = t;
        }
    }
}
public class UtilityDemo {
    public static void main(String[] args) {

        System.out.println(MathUtil.power(2, 3));
        System.out.println(MathUtil.factorial(5));
        System.out.println(MathUtil.isPrime(7));
        System.out.println(MathUtil.gcd(12, 18));

        System.out.println(StringUtil.reverse("java"));
        System.out.println(StringUtil.isPalindrome("madam"));
        System.out.println(StringUtil.countVowels("hello"));
        System.out.println(StringUtil.removeDuplicates("banana"));

        int[] a = {4, 2, 7, 1};
        ArrayUtil.sort(a);
        for (int i : a) System.out.print(i + " ");
        System.out.println();

        System.out.println(ArrayUtil.search(a, 7));
        System.out.println(ArrayUtil.findMax(a));
        System.out.println(ArrayUtil.findMin(a));

        ArrayUtil.reverseArray(a);
        for (int i : a) System.out.print(i + " ");
    }
}
