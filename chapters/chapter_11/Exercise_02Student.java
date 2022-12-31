package chapters.chapter_11;

public class Exercise_02Student extends Exercise_02Person {
    public static final String FRESHMAN = "FRESHMAN";
    public static final String SOPHOMORE = "SOPHOMORE";
    public static final String JUNIOR = "JUNIOR";
    public static final String SENIOR = "SENIOR";
    private String status ;
    public Exercise_02Student() {
        this("") ;
    }

    public Exercise_02Student(String status) {
        this.status = status;
    }

    public Exercise_02Student(String name, String adress, String phoneNumber, String emailAddress, String status) {
        super(name, adress, phoneNumber, emailAddress);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return "Student " + getName() ;
    }
}
