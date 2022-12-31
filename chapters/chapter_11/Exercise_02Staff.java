package chapters.chapter_11;

import chapters.chapter_10.Exercise_14MyDate;

public class Exercise_02Staff extends Exercise_02Employee{
    private String title ;
    public Exercise_02Staff() {
        this("") ;
    }

    public Exercise_02Staff(String title) {
        this.title = title;
    }

    public Exercise_02Staff(String office, double salary, Exercise_14MyDate dateHired, String title) {
        super(office, salary, dateHired);
        this.title = title;
    }

    public Exercise_02Staff(String name, String adress, String phoneNumber, String emailAddress, String office, double salary, Exercise_14MyDate dateHired, String title) {
        super(name, adress, phoneNumber, emailAddress, office, salary, dateHired);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return  "Staff " + getName() ;
    }
}
