public class StringBuilderDemo {

    public static void main(String[] args) {

        // Using String
        String str = "Java";
        str = str + " Programming";
        str = str + " Language";
        System.out.println("Using String: " + str);

        System.out.println("----------------------");

        // Using StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        sb.append(" Language");

        System.out.println("Using StringBuilder: " + sb);

        sb.insert(4, " Core");
        System.out.println("After insert: " + sb);

        sb.delete(4, 9);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}
