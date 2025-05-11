public class CountOnes {
    public static void main(String[] args) {
        int n = 77;
        int count = 0;
        int len = Integer.toBinaryString(n).length();
        for (int i = 0; i < len; i++) {
            if ((n & 1) == 1) {
                count++;
            }
            n >>= 1;
        }
        System.out.println(count);

        String s1 = "sravani";
        String s2 = "lsravani";
        System.out.println("The character which is not there in first string is:");
        for (int i = 0; i < Math.min(s1.length(), s2.length()); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                System.out.println(s2.charAt(i));
                return;
            }
        }
        System.out.println(s2.charAt(s2.length() - 1));
    }
}
