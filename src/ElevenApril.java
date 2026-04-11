public class ElevenApril {
    public static String revWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].isEmpty()) continue;
            if (!sb.isEmpty()) {
                sb.append(" ");
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "Vishesh Soni";
        System.out.println(revWords(s));
    }
}
