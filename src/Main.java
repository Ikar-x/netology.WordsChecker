public class Main {
    public static void main(String[] args) {
        String s = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        WordsChecker wc = new WordsChecker(s);
        System.out.println(wc.hasWord("ipsum"));
        System.out.println(wc.hasWord("hello"));
        System.out.println(wc.hasWord("occaecat"));
        System.out.println(wc.hasWord("world"));
    }
}