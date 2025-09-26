package nine_strings;

public class StringTypes {
    public static void main(String[] args) {
        
        // String Immutability 
        String str = "hell"; // hello
        System.out.println("With Strings");
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str.concat("o")));
        System.out.println(System.identityHashCode(str));
        System.out.println(str);
        System.out.println(str.concat("o"));
        System.out.println(str);

        // StringBuilder - Mutable String 
        System.out.println("With String Builder");
        StringBuilder builder = new StringBuilder("hell");
        System.out.println(System.identityHashCode(builder));
        System.out.println(System.identityHashCode(builder.append("o")));
        System.out.println(System.identityHashCode(builder));

        System.out.println(builder);
        System.out.println(builder.append("o"));
        System.out.println(builder);

        // StringBuffer - Mutable String 
        System.out.println("With String Buffer");
        StringBuffer buffer = new StringBuffer("hell");
        System.out.println(System.identityHashCode(buffer));
        System.out.println(System.identityHashCode(buffer.append("o")));
        System.out.println(System.identityHashCode(buffer));

    }
}
