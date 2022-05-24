public class Reverse {
    public static String reverseBuilder(String name){
        StringBuilder stringBuilder = new StringBuilder(name);
        return String.valueOf(stringBuilder.reverse());
    }
    public static String reverseIterative(String name){
        String reverse = "";
        for (int i = name.length()-1; i >= 0 ; i--) {
            reverse += name.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        String name = "Yoseph";
        System.out.println(reverseBuilder(name));
        System.out.println(reverseIterative(name));
    }
}
