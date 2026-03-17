class Main {
    public static void main(String[] args) {
        String s = "Hello World";
        char str[] = s.toCharArray();
        char[] modified = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            modified[i] = (char)(str[i] ^ 0);
        }

        for (char a : modified) {
            System.out.print(a);
        }
    }
}