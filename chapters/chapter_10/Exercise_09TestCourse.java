package chapters.chapter_10;

public class Exercise_09TestCourse {
    public static void main(String[] args) {
        Exercise_09Course course1 = new Exercise_09Course("AFC101");
        course1.addStudent("Ali");
        course1.addStudent("Veli");
        course1.addStudent("Eren");
        course1.dropStudent("Ali");
        String[] students = course1.getStudents();
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
