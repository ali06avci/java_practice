package minischoolproject;
public class Instructor implements ITDepartment, LanguageDepartment {
    private String name;
    private String lastname;
    private String title;
    private String departmentName;
    private String labName;
    private long id;
    @Override
    public String departmentName() {
        return this.departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
    @Override
    public Instructor instructor() {
        return this;
    }
    @Override
    public Student student() {
        return null;
    }
    @Override
    public String labName() {
        return this.labName;
    }
    public void setLabName(String labName) {
        this.labName = labName;
    }
    @Override
    public boolean isLabAvailable() {
        return false;
    }
    public String getName() {
        return name;
    }
    public String getLastname() {
        return lastname;
    }
    public String getTitle() {
        return title;
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
    public void setTitle(String title) {
        this.title = title;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Instructor [Name=" + name + ", Last Name=" + lastname + ", Title=" + title + ", Department Name="
                + departmentName + ", Laboratory Name=" + labName + ", ID=" + id + "]";
    }
}