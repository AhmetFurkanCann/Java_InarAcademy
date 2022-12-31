package chapters.chapter_13;

public class Exercise_13Test {
    public static void main(String[] args) {
        Exercise_13Course course = new Exercise_13Course("Math");
        course.addStudent("Mehmet");
        Exercise_13Course courseClone = (Exercise_13Course) course.clone() ;
        System.out.println("Is course == courseClone ? : " + (course == courseClone));
    }
}
