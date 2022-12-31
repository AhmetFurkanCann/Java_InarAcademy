package chapters.chapter_11;

public class Exercise_02Test {
    public static void main(String[] args) {
        Exercise_02Person person = new Exercise_02Person();
        Exercise_02Student student = new Exercise_02Student() ;
        Exercise_02Employee employee = new Exercise_02Employee() ;
        Exercise_02Faculty faculty = new Exercise_02Faculty() ;
        Exercise_02Staff staff = new Exercise_02Staff() ;
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}
