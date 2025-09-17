package sixth_oops;

public class Employee {

    // instance variable
        String empName;

    // static variable
    static String companyName = "Digital Lync";

    // show details of employee
    public void showEmpInfo(){
        // local variable
        int sal = 100000;

        System.out.println(empName + " earns "+sal +" at "+companyName);
    }
    
    public static void main(String[] args) {

        Employee ravi = new Employee();
        ravi.empName = "Ravi";
        ravi.showEmpInfo();

    }
}
