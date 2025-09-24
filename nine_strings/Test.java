package nine_strings;

public class Test {

    public static void main(String[] args) {
        
        int i = 10;
        String name = "Ravi";

        // Test t1 = "Ravi";
        // System.out.println(t1);

        System.out.println(name);

        Test t1 = new Test();
        System.out.println(t1); // Address : nine_strings.Test@6d06d69c
        
        String s2 = new String();
        System.out.println(s2); // empty string

        // following examples will help you understand how strings manage memory
        String str1 = "hello";
        String str2 = "hello";


        // string memory pool 
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str1 == str2);

        
        // when we use new keyword, always new memory block will be created   
        String str3 = new String("hello");
        String str4 = new String("hello");
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));

        System.out.println(str3 == str4);

        // == with strings compare object address 
        // == with primitives compare values
        // equals() method with strings compare values

        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));


    }

}
