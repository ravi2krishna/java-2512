package sixth_oops;

public class Methods {
    
    // very simple method - void(nothing) means no return value 
    public void greet(){
        System.out.println("Good Morning");
    }

    // simple method - thats returns some value
    public int add() {
        int num1 = 10;
        int num2 = 20;
        return num1 + num2;
    }

    // simple method - thats returns some value and takes input using parameters
    public int dynamicAdd(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Methods obj =new Methods();
        obj.greet();
        System.out.println(obj.add());
        System.out.println(obj.dynamicAdd(100,200));
        System.out.println(obj.dynamicAdd(50,200));
        System.out.println(obj.dynamicAdd(500,200));
    }

}
