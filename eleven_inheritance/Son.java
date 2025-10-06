package eleven_inheritance;

public class Son extends Father {

    public void hasCar() {
        System.out.println("Has Car");
    }

    public static void main(String[] args) {
        Son son = new Son();
        son.hasHouse();
        son.hasLand();
        son.hasCar();
    }
}
