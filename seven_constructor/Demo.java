package seven_constructor;

public class Demo {

    // instance data
    int x;
    int y;

    public Demo() {
        x = 100;
        y = 200;
    }

    public Demo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int addNums() {
        return x + y;
    }

    public static void main(String[] args) {
        Demo obj = new Demo(300,500);
        System.out.println("Sum is: "+obj.addNums()); // 0 -> 800
    }
}
