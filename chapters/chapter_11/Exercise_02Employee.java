package chapters.chapter_11;

import chapters.chapter_10.Exercise_14MyDate;

public class Exercise_02Employee extends Exercise_02Person{
    private String office ;
    private double salary ;
    private Exercise_14MyDate dateHired ;
    public Exercise_02Employee() {
        this("",0 , new Exercise_14MyDate());
    }

    public Exercise_02Employee(String office, double salary, Exercise_14MyDate dateHired) {
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public Exercise_02Employee(String name, String adress, String phoneNumber, String emailAddress, String office, double salary, Exercise_14MyDate dateHired) {
        super(name, adress, phoneNumber, emailAddress);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Exercise_14MyDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(Exercise_14MyDate dateHired) {
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
        return  "Employee" + getName() ;
    }
}
