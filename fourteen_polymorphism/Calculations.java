package fourteen_polymorphism;

public class Calculations {
    // Method Over Loading Concept
    // public void add(){
    //     // add two numbers
    // }

    // public void add(){
    //     // add three numbers
    // }

    public void addTwoNumbers(){
        // add two numbers
    }

     public void addThreeNumbers(){
        // add two numbers
    }

    public void add(int a, int b){
        // add two numbers
        System.out.println(a+b);
    }

    public void add(int a, int b, int c){
        // add three numbers
        System.out.println(a+b+c);
    }

    public void add(double a, int b){
        // add two numbers
        System.out.println(a+b);
    }

    public void add(int a, double b){
        // add two numbers
        System.out.println(a+b);
    }



}
