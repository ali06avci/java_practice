package simpleschoolproject;
public class Student implements ITDepartment, LanguageDepartment{
    private String name;
    private String lastname;
    private long id;
    private String departmentName;
    private Instructor instructor;
    private String labName;

    public Student(String name, String lastname, long id, String departmentName, Instructor instructor, String labName) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.departmentName = departmentName;
        this.instructor = instructor;
        this.labName = labName;
    }
    public Student() {
    }
    @Override //This method comes from super and parent interfaces
    public String departmentName() {
        return this.departmentName;
    }
    @Override //This method comes from super and parent interfaces, so no need to create a getter
    public Instructor instructor() {
        return this.instructor;
    }
    @Override //This method comes from super and parent interfaces, so no need to create a getter
    public Student student() {
        return this;
    }
    @Override //This method comes from super and parent interfaces, so no need to create a getter
    public String labName() {
        return this.labName;
    }
    @Override //This method comes from super and parent interfaces, so no need to create a getter
    public boolean isLabAvailable() {
        return false;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public long getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public void setLabName(String labName) {
        this.labName = labName;
    }
    @Override
    public String toString() {
        return "Student [Name=" + name + ", Last Name=" + lastname + ", ID=" + id + ", Department Name=" + departmentName
                + ", Instructor=" + instructor + ", Laboratory Name=" + labName + "]";
    }
}