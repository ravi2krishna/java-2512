package eight_arrays;

public class MD {
    public static void main(String[] args) {
        
        // multi dim array
        // datatype [][] variable_name = new datatype[size][size];
        int [][] matrix = new int [3][3];

        // assign
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;

        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;

        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // access data 
        System.out.println(matrix[0][2]);

        // length is of rows 
        System.out.println(matrix.length);
        System.out.println("=========");

        // access all
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i]);
            int [] data = matrix[i];
            //System.err.println(data);
            for (int j = 0; j < data.length; j++) {
                System.out.println(data[j]);
            }
        }

    }
}
