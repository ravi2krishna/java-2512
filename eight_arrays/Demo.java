package eight_arrays;

public class Demo {

    public static void main(String[] args) {
        
        // datatype [] variable_name = new datatype[size];
        int [] nums = new int[5]; // 1,2,3,4,5
        String [] text = new String[5]; // "one","two",....

        // assign data 
        nums[0] = 10;
        nums[3] = 40;

        // access data 
        System.out.println(nums); // memory address 
        System.out.println(nums[0]);

        // incorrect use of index 
        // nums[10] = 100; // Index 10 out of bounds for length 5
        // System.out.println(nums[10]);

        // arrays direct initialization
        int [] numbers = {10,20,30,40,50,60,70,80};
        System.out.println(numbers[0]);     
        System.out.println(numbers[3]); 

        System.out.println(numbers.length);

        // get all elements 
        for (int num = 0; num < numbers.length; num++) {
            System.out.println(numbers[num]);
        }

        // perform operations 
        int [] num = {10,20,35,40,33,60,70,85};
        // get me even elements out of this array
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                System.out.println(num[i]);
            }
        }

        // give me total and average score 
        int [] marks = {10,20,30,40,50}; // 150
        int totalMarks = 0; // 30
        
        for (int i = 0; i < marks.length; i++) {
            totalMarks = totalMarks + marks[i] ; // 0+10+20
        }
        int avgMarks = totalMarks/marks.length;
        System.out.println("Total Marks: "+totalMarks);
        System.out.println("Average Marks: "+avgMarks);

    }
}