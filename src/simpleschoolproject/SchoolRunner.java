package simpleschoolproject;
public class SchoolRunner {
    public static void main(String[] args) {
        Student std = new Student();
        std.setName("Ali");
        std.setLastname("AVCI");
        std.setDepartmentName(ITDepartment.NAME);
        std.setId(123456);

        Instructor ins = new Instructor();
        ins.setName("John");
        ins.setLastname("Nash");
        ins.setId(123457);
        ins.setDepartmentName(ITDepartment.NAME);
        std.setInstructor(ins);

        //It can only be reference type  // Object type
        ITDepartment it = std;

        School sch = std;

        System.out.println("Student Name: "+sch.student().getName());
        System.out.println("Student Last Name: "+sch.student().getLastname());
        System.out.println("Student ID : "+sch.student().getId());
        System.out.println("Student Instructor: "+sch.student().instructor().getName());
        System.out.println("Department Name: "+ sch.departmentName());
    }
}