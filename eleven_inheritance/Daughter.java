package eleven_inheritance;

public class Daughter extends Father {

    public void hasBusiness() {
        System.out.println("Has Business");
    }

    public static void main(String[] args) {
        Daughter daughter = new Daughter();
        daughter.hasHouse();
        daughter.hasLand();
        daughter.hasBusiness();
    }

}
