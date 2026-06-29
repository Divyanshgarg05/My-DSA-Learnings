class stringCompression {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char current = str.charAt(i);
            int count = 0;

            while (i < str.length() && str.charAt(i) == current) {
                count++;
                i++;
            }

            sb.append(current);

            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "aaaaabbbbccchhhhaaas";
        System.out.println(compress(s));
    }
}