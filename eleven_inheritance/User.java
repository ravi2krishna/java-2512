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

        System.out.println("==== With Inheritance ====");
        
        System.out.println("==== Learner ====");
        learner.watchVideos();

        VideoAdminInherit videoAdminInherit = new VideoAdminInherit();
        System.out.println("==== Video Admin ====");
        videoAdminInherit.watchVideos();
        videoAdminInherit.addVideos();

        SuperAdminInherit superAdminInherit = new SuperAdminInherit();
        System.out.println("==== Super Admin ====");
        superAdminInherit.watchVideos();
        superAdminInherit.addVideos();
        superAdminInherit.deleteVideos();

    }
}
