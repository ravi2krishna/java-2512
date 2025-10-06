package eleven_inheritance;

public class D implements B,C {
    public void featureD(){
        System.out.println("Feature D");
    }

    public void featureC() {
       System.out.println("Feature C");
    }

    @Override
    public void featureB() {
        System.out.println("Feature B");
    }

    @Override
    public void featureA() {
        System.out.println("Feature A");
    }
}
