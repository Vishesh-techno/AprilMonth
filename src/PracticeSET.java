import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PracticeSET {
    //    Write a program to count the number of words in a given sentence.
    public static int countChar(String s) {
        String[] word = s.split("\\s+");
        return word.length;
    }

    //   Write a program to merge two sorted arrays into a single sorted array
    public static int[] merge(int[] a, int[] b) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[a.length + b.length];
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                ans[k] = a[i];
                i++;
                k++;
            } else {
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while (i < a.length) {
            ans[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            ans[k] = b[j];
            j++;
            k++;
        }
        return ans;
    }

    //    Write a Java program to check if two strings are anagrams of each other.
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] res = new int[26];
        for (int i = 0; i < s.length(); i++) {
            res[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < t.length(); i++) {
            res[t.charAt(i) - 'a']--;
        }

        for (int re : res) {
            if (re != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPerfectSquare(int n) {
        for (int i = 0; i * i <= n; i++) {
            if (i * i == n) {
                return true;
            }
        }
        return false;
    }

    //    Implement a program to find the common elements between two arrays
    public static int[] findCommon(int[] a, int[] b) {
        Set<Integer> set = new HashSet<>();
        int[] res = new int[Math.min(a.length, b.length)];
        for (int i : a) {
            set.add(i);
        }
        int k = 0;
        for (int i : b) {
            if (set.contains(i)) {
                res[k++] = i;
            }
        }
        return Arrays.copyOf(res, k);
    }

    //    Write a Java program to convert a string into a character array without using built-in methods.
    public static char[] convertString(String s) {
//        String[] str = s.split("\\s+");
        char[] res = new char[s.length()];
//        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            res[i] = s.charAt(i);
        }
        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        System.out.println(countChar(s));
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//        int n1 = sc.nextInt();
//        int[] b = new int[n1];
//        for (int i = 0; i < n; i++) {
//            b[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(merge(a, b)));
        String x = sc.next();
        String y = sc.next();
        System.out.println(isAnagram(x, y));
        int n = sc.nextInt();

        if (isPerfectSquare(n)) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}
