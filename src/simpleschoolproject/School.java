package simpleschoolproject;
public interface School {
    public static final String SCHOOL_NAME ="Yildiz Technical University";
    public abstract String departmentName();//will return related department
    public abstract Instructor instructor();//will return a whole instructor
    public abstract Student student();//will return a whole student

    //What object can I only call from School
    //Department name/ Student / Instructor
}