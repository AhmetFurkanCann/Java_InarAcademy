package chapters.chapter_10;

public class Exercise_09Course {
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Exercise_09Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents == students.length){
            String[] temp = new String[students.length * 2];
            for (int i = 0; i < numberOfStudents; i++) {
                temp[i]=students[i];
            }
            students = temp;
        }
        students[numberOfStudents]=student;
        numberOfStudents++;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        int index = -1 ;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].matches(student)){
                index = i;
            }
        }
        if (index != -1) {
            String[] temp = new String[numberOfStudents - 1];
            int count = 0;
            for (int i = 0 ; i < numberOfStudents; i++) {
                if (i == index) {
                    continue;
                }
                temp[count] = students[i];
                count++;
            }
            students = temp;
        }
    }
    public void clear() {
        students = new String[100];
        numberOfStudents = 0 ;
    }
}
