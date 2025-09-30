package eleven_inheritance;

public class User {
    public static void main(String[] args) {
        
        Learner learner = new Learner();
        System.out.println("==== Learner ====");
        learner.watchVideos();

        VideoAdmin videoAdmin = new VideoAdmin();
        System.out.println("==== Video Admin ====");
        videoAdmin.watchVideos();
        videoAdmin.addVideos();

        SuperAdmin superAdmin = new SuperAdmin();
        System.out.println("==== Super Admin ====");
        superAdmin.watchVideos();
        superAdmin.addVideos();
        superAdmin.deleteVideos();


    }
}
