package chapters.chapter_11;

import chapters.chapter_10.Exercise_14MyDate;

public class Exercise_02Faculty extends Exercise_02Employee{
    private int officeHours ;
    private int rank ;
    public Exercise_02Faculty() {
        this(0 , 0 ) ;
    }

    public Exercise_02Faculty(int officeHours, int rank) {
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Exercise_02Faculty(String office, double salary, Exercise_14MyDate dateHired, int officeHours, int rank) {
        super(office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public Exercise_02Faculty(String name, String adress, String phoneNumber, String emailAddress, String office, double salary, Exercise_14MyDate dateHired, int officeHours, int rank) {
        super(name, adress, phoneNumber, emailAddress, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }
    @Override
    public String toString() {
        return  "Faculty " + getName() ;
    }
}
