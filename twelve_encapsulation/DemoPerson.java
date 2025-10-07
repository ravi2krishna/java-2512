package twelve_encapsulation;

public class DemoPerson {
    
    public String publicName = "Public Name";
    protected String protectedName = "Protected Name";
    String defaultName = "Default Name"; // default means no access modifier
    private String privateName = "Private Name";

    public void display() {
        System.out.println(" Inside Same Class ");
        System.out.println(publicName);
        System.out.println(protectedName);
        System.out.println(defaultName);
        System.out.println(privateName);
    }

}
