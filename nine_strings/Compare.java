package nine_strings;

public class Compare {
    public static void main(String[] args) {
        
        // String vs StringBuilder vs StringBuffer
        
        // String
        long startTimeString = System.currentTimeMillis();
        String str = "Good ";
        for (int i = 0; i < 10000; i++) {
            str = str.concat("Morning");
        }
        long endTimeString = System.currentTimeMillis();
        System.out.println("Time Taken By Strings: "+(endTimeString-startTimeString));

        // StringBuilder
        long startTimeStringBuilder = System.currentTimeMillis();
        StringBuilder builder = new StringBuilder("Good ");
        for (int i = 0; i < 10000; i++) {
            builder = builder.append("Morning");
        }
        long endTimeStringBuilder = System.currentTimeMillis();
        System.out.println("Time Taken By String Builder: "+(endTimeStringBuilder-startTimeStringBuilder));

        // StringBuffer
        long startTimeStringBuffer = System.currentTimeMillis();
        StringBuffer buffer = new StringBuffer("Good ");
        for (int i = 0; i < 10000; i++) {
            buffer = buffer.append("Morning");
        }
        long endTimeStringBuffer = System.currentTimeMillis();
        System.out.println("Time Taken By String Buffer: "+(endTimeStringBuffer-startTimeStringBuffer));

    }
}
