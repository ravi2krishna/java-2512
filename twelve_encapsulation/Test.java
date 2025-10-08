package twelve_encapsulation;

public class Test {

    public class PublicInner {
        public void show(){
            System.out.println("Public Inner Class");
        }
    }

    protected class ProtectedInner {
        public void show(){
            System.out.println("Protected Inner Class");
        }
    }
    
    class DefaultInner {
        public void show(){
            System.out.println("Default Inner Class");
        }
    }

    private class PrivateInner {
        public void show(){
            System.out.println("Protected Inner Class");
        }
    }
    


}